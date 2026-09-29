package p128g2;

import android.annotation.SuppressLint;
import android.content.Context;
import android.support.v4.media.session.C0166e;
import android.view.View;
import androidx.constraintlayout.motion.widget.MotionLayout;

/* JADX INFO: renamed from: g2.a */
/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"LogConditional"})
public final class C5663a {
    /* JADX INFO: renamed from: a */
    public static String m12018a() {
        StackTraceElement stackTraceElement = new Throwable().getStackTrace()[1];
        return ".(" + stackTraceElement.getFileName() + ":" + stackTraceElement.getLineNumber() + ") " + stackTraceElement.getMethodName() + "()";
    }

    /* JADX INFO: renamed from: b */
    public static String m12019b() {
        StackTraceElement stackTraceElement = new Throwable().getStackTrace()[1];
        return ".(" + stackTraceElement.getFileName() + ":" + stackTraceElement.getLineNumber() + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.String] */
    /* JADX INFO: renamed from: c */
    public static String m12020c(int i10, Context context) {
        if (i10 == -1) {
            return "UNKNOWN";
        }
        try {
            i10 = context.getResources().getResourceEntryName(i10);
            return i10;
        } catch (Exception unused) {
            return C0166e.m761g("?", i10);
        }
    }

    /* JADX INFO: renamed from: d */
    public static String m12021d(View view) {
        try {
            return view.getContext().getResources().getResourceEntryName(view.getId());
        } catch (Exception unused) {
            return "UNKNOWN";
        }
    }

    /* JADX INFO: renamed from: e */
    public static String m12022e(int i10, MotionLayout motionLayout) {
        return i10 == -1 ? "UNDEFINED" : motionLayout.getContext().getResources().getResourceEntryName(i10);
    }
}
