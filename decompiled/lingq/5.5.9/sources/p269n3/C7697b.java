package p269n3;

import android.annotation.SuppressLint;
import android.text.Editable;
import androidx.emoji2.text.C0902p;

/* JADX INFO: renamed from: n3.b */
/* JADX INFO: loaded from: classes.dex */
public final class C7697b extends Editable.Factory {

    /* JADX INFO: renamed from: a */
    public static final Object f42208a = new Object();

    /* JADX INFO: renamed from: b */
    public static volatile C7697b f42209b;

    /* JADX INFO: renamed from: c */
    public static Class<?> f42210c;

    @SuppressLint({"PrivateApi"})
    public C7697b() {
        try {
            f42210c = Class.forName("android.text.DynamicLayout$ChangeWatcher", false, C7697b.class.getClassLoader());
        } catch (Throwable unused) {
        }
    }

    @Override // android.text.Editable.Factory
    public final Editable newEditable(CharSequence charSequence) {
        Class<?> cls = f42210c;
        return cls != null ? new C0902p(cls, charSequence) : super.newEditable(charSequence);
    }
}
