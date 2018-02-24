package edu.vccs.email.kcb2464.rpncalculatortest;


import edu.brcc.maxfieldj.rpncalcmodelcontroller.RPNCalcMath;

/**
 * Created by Kyle on 2/24/2018.
 */

public class RPNCalcGUIHelper
{
    // the string that is returned for the user to see
    private StringBuilder display;

    private boolean isNumberEntryFinished;           // current num is completely entered
    private RPNCalcMath calc = new RPNCalcMath();    // MVC controller object

    /**
     * no-arg constructor. initialize display attributes
     */
    public RPNCalcGUIHelper()
    {
        setDisplay("");
        isNumberEntryFinished = true;
    }

    /**
     * set/reset the string to be displayed
     * @param init the string to be displayed
     */
    private void setDisplay(String init)
    {
        init = (init == null) ? "" : init;
        display = new StringBuilder(init);
    }

    /**
     * do all the work
     * @param key a key pressed by the user: 0-9,+/-,<
     * @return the current number as a string
     */
    public String addKey(String key)
    {
        double num;                  // the double version of the current number

        switch (key)
        {
            case "+":
                finishCurrentNum();
                setDisplay("" + calc.add());
                break;

            case "-":
                finishCurrentNum();
                setDisplay("" + calc.subtract());
                break;

            case "*":
                finishCurrentNum();
                setDisplay("" + calc.multiply());
                break;

            case "/":
                finishCurrentNum();
                setDisplay("" + calc.divide());
                break;

            case "^":     // "enter" key
                try         // e.g. "-" is invalid
                {
                    num = Double.parseDouble(display.toString());
                    calc.enterNumber(num);
                    setDisplay("" + num);
                    isNumberEntryFinished = true;
                }
                catch (Exception e)
                {
                    // if it isn't a number, ignore the '^'
                }
                break;

            case "+/-":    // change sign
                if (isNumberEntryFinished)
                    setDisplay("-");
                else
                {
                    if (display.toString().charAt(0) == '-')
                        display.deleteCharAt(0);
                    else
                        display.insert(0, '-');
                }
                isNumberEntryFinished = false;
                break;

            case "<":
                if (!isNumberEntryFinished)
                    display.deleteCharAt(display.length()-1);
                break;

            case "pi":
                if (!isNumberEntryFinished)
                {
                    try {
                        num = Double.parseDouble(display.toString());
                        // if a number was in display, enter it
                        calc.enterNumber(num);
                    }
                    catch (Exception e) {
                        // if it wasn't a number, ignore current display
                    }
                }
                setDisplay("" + Math.PI);
                calc.enterNumber(Math.PI);
                isNumberEntryFinished = true;
                break;

            case ".":  // only one . in a number!
                if (isNumberEntryFinished)
                {
                    setDisplay(".");
                    isNumberEntryFinished = false;
                    break;
                }
                if (display.toString().contains("."))
                    break;
                // else, fall through and add to display string

            default:   // the . (from case above) or any digit key
                if (isNumberEntryFinished)
                    setDisplay("");
                isNumberEntryFinished = false;
                display.append(key);
                break;
        }

        return display.toString();
    }

    /**
     * some code common to all the operator keys in addKey
     */
    private void finishCurrentNum()
    {
        double num;                  // the double version of the current number

        if (!isNumberEntryFinished)
        {
            num = Double.parseDouble(display.toString());
            calc.enterNumber(num);
        }
        isNumberEntryFinished = true;
    }
}