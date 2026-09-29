package androidx.appcompat.widget;

import android.app.Activity;
import android.content.ClipData;
import android.os.Build;
import android.text.Selection;
import android.text.Spannable;
import android.view.DragEvent;
import android.view.View;
import android.widget.TextView;
import p471x2.C10029b0;
import p471x2.C10030c;

/* JADX INFO: renamed from: androidx.appcompat.widget.s */
/* JADX INFO: loaded from: classes.dex */
public final class C0340s {
    /* JADX INFO: renamed from: a */
    public static boolean m1265a(DragEvent dragEvent, TextView textView, Activity activity) {
        activity.requestDragAndDropPermissions(dragEvent);
        int offsetForPosition = textView.getOffsetForPosition(dragEvent.getX(), dragEvent.getY());
        textView.beginBatchEdit();
        try {
            Selection.setSelection((Spannable) textView.getText(), offsetForPosition);
            ClipData clipData = dragEvent.getClipData();
            C10029b0.m18654j(textView, (Build.VERSION.SDK_INT >= 31 ? new C10030c.a(clipData, 3) : new C10030c.c(clipData, 3)).mo18779a());
            textView.endBatchEdit();
            return true;
        } catch (Throwable th2) {
            textView.endBatchEdit();
            throw th2;
        }
    }

    /* JADX INFO: renamed from: b */
    public static boolean m1266b(DragEvent dragEvent, View view, Activity activity) {
        activity.requestDragAndDropPermissions(dragEvent);
        ClipData clipData = dragEvent.getClipData();
        C10029b0.m18654j(view, (Build.VERSION.SDK_INT >= 31 ? new C10030c.a(clipData, 3) : new C10030c.c(clipData, 3)).mo18779a());
        return true;
    }
}
