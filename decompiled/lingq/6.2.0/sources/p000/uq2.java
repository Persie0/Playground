package p000;

import android.text.Editable;

/* JADX INFO: loaded from: classes2.dex */
public final class uq2 extends Editable.Factory {

    /* JADX INFO: renamed from: a */
    public static final Object f64207a = new Object();

    /* JADX INFO: renamed from: b */
    public static volatile uq2 f64208b;

    /* JADX INFO: renamed from: c */
    public static Class f64209c;

    @Override // android.text.Editable.Factory
    public final Editable newEditable(CharSequence charSequence) {
        Class cls = f64209c;
        return cls != null ? new le9(cls, charSequence) : super.newEditable(charSequence);
    }
}
