package p000;

import android.view.ActionMode;
import android.view.SearchEvent;
import android.view.View;
import android.view.Window;
import com.google.android.apps.camera.bottombar.C0100R;

/* JADX INFO: renamed from: gg */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class C0209gg {
    /* JADX INFO: renamed from: a */
    static ActionMode m9199a(Window.Callback callback, ActionMode.Callback callback2, int i) {
        return callback.onWindowStartingActionMode(callback2, i);
    }

    /* JADX INFO: renamed from: b */
    static boolean m9200b(Window.Callback callback, SearchEvent searchEvent) {
        return callback.onSearchRequested(searchEvent);
    }

    /* JADX INFO: renamed from: c */
    public static final void m9201c(View view, InterfaceC0914ps interfaceC0914ps) {
        view.getClass();
        view.setTag(C0100R.id.view_tree_on_back_pressed_dispatcher_owner, interfaceC0914ps);
    }
}
