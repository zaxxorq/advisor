package advisor.ocl.util;

import android.content.Context;
import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;

/**
 * Created by ezarsto on 17.9.2015..
 */
public class MessageBox {
    public  static void showOK(Context context, String title, String message)
    {
        final AlertDialog.Builder dlgAlert  = new AlertDialog.Builder(context);
        dlgAlert.setMessage(message);
        dlgAlert.setTitle(title);
        dlgAlert.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        //dismiss the dialog
                        dialog.dismiss();
                    }
                }
        );
            dlgAlert.setCancelable(true);
            dlgAlert.create().

            show();
        }
    }
