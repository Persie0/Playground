package p000;

import android.content.ClipData;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.CancellationSignal;
import android.view.PointerIcon;
import android.view.View;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class afj {
    /* JADX INFO: renamed from: a */
    static void m501a(View view) {
        view.cancelDragAndDrop();
    }

    /* JADX INFO: renamed from: b */
    static void m502b(View view) {
        view.dispatchFinishTemporaryDetach();
    }

    /* JADX INFO: renamed from: c */
    static void m503c(View view) {
        view.dispatchStartTemporaryDetach();
    }

    /* JADX INFO: renamed from: d */
    public static void m504d(View view, PointerIcon pointerIcon) {
        view.setPointerIcon(pointerIcon);
    }

    /* JADX INFO: renamed from: e */
    static void m505e(View view, View.DragShadowBuilder dragShadowBuilder) {
        view.updateDragShadow(dragShadowBuilder);
    }

    /* JADX INFO: renamed from: f */
    static boolean m506f(View view, ClipData clipData, View.DragShadowBuilder dragShadowBuilder, Object obj, int i) {
        return view.startDragAndDrop(clipData, dragShadowBuilder, obj, i);
    }

    /* JADX INFO: renamed from: g */
    public static final CancellationSignal m507g() {
        return new CancellationSignal();
    }

    /* JADX INFO: renamed from: h */
    public static final void m508h(SQLiteOpenHelper sQLiteOpenHelper, boolean z) {
        sQLiteOpenHelper.getClass();
        sQLiteOpenHelper.setWriteAheadLoggingEnabled(z);
    }
}
