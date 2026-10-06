package p000;

import android.os.BadParcelableException;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewParent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;

/* JADX INFO: renamed from: dr */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class C0139dr {
    /* JADX INFO: renamed from: a */
    public static Bundle m6612a(Bundle bundle) {
        bundle.setClassLoader(C0139dr.class.getClassLoader());
        try {
            bundle.isEmpty();
            return bundle;
        } catch (BadParcelableException e) {
            Log.e("MediaSessionCompat", "Could not unparcel the data.");
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m6613b(InputConnection inputConnection, EditorInfo editorInfo, View view) {
        if (inputConnection == null || editorInfo.hintText != null) {
            return;
        }
        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
            if (parent instanceof InterfaceC0865nx) {
                editorInfo.hintText = ((InterfaceC0865nx) parent).m17961a();
                return;
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public static C0139dr m6614c() {
        return new axy();
    }

    /* JADX INFO: renamed from: d */
    public static C0139dr m6615d() {
        return new axz();
    }

    /* JADX INFO: renamed from: e */
    public static C0139dr m6616e() {
        return new aya(axt.f2689a);
    }
}
