package p000;

import android.app.Activity;
import android.content.ClipData;
import android.os.Build;
import android.text.Selection;
import android.text.Spannable;
import android.view.DragEvent;
import android.view.View;
import android.widget.TextView;

/* JADX INFO: renamed from: mq */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC3344mq {
    /* JADX INFO: renamed from: a */
    public static boolean m16992a(DragEvent dragEvent, TextView textView, Activity activity) {
        yk1 webVar;
        activity.requestDragAndDropPermissions(dragEvent);
        int offsetForPosition = textView.getOffsetForPosition(dragEvent.getX(), dragEvent.getY());
        textView.beginBatchEdit();
        try {
            Selection.setSelection((Spannable) textView.getText(), offsetForPosition);
            ClipData clipData = dragEvent.getClipData();
            if (Build.VERSION.SDK_INT >= 31) {
                webVar = new web(clipData, 3);
            } else {
                zk1 zk1Var = new zk1();
                zk1Var.f71674b = clipData;
                zk1Var.f71675c = 3;
                webVar = zk1Var;
            }
            dta.m10637h(textView, webVar.build());
            return true;
        } finally {
            textView.endBatchEdit();
        }
    }

    /* JADX INFO: renamed from: b */
    public static boolean m16993b(DragEvent dragEvent, View view, Activity activity) {
        yk1 webVar;
        activity.requestDragAndDropPermissions(dragEvent);
        ClipData clipData = dragEvent.getClipData();
        if (Build.VERSION.SDK_INT >= 31) {
            webVar = new web(clipData, 3);
        } else {
            zk1 zk1Var = new zk1();
            zk1Var.f71674b = clipData;
            zk1Var.f71675c = 3;
            webVar = zk1Var;
        }
        dta.m10637h(view, webVar.build());
        return true;
    }
}
