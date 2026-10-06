package p000;

import android.text.Editable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ajb extends Editable.Factory {

    /* JADX INFO: renamed from: a */
    private static final Object f481a = new Object();

    /* JADX INFO: renamed from: b */
    private static volatile Editable.Factory f482b;

    /* JADX INFO: renamed from: c */
    private static Class f483c;

    private ajb() {
        try {
            f483c = Class.forName("android.text.DynamicLayout$ChangeWatcher", false, getClass().getClassLoader());
        } catch (Throwable th) {
        }
    }

    /* JADX INFO: renamed from: a */
    public static Editable.Factory m801a() {
        if (f482b == null) {
            synchronized (f481a) {
                if (f482b == null) {
                    f482b = new ajb();
                }
            }
        }
        return f482b;
    }

    @Override // android.text.Editable.Factory
    public final Editable newEditable(CharSequence charSequence) {
        Class cls = f483c;
        return cls != null ? new aja(cls, charSequence) : super.newEditable(charSequence);
    }
}
