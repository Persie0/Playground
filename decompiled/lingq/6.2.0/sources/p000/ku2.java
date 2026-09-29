package p000;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class ku2 implements xy2 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f48425a;

    /* JADX INFO: renamed from: b */
    public final so7 f48426b;

    public /* synthetic */ ku2(so7 so7Var, int i) {
        this.f48425a = i;
        this.f48426b = so7Var;
    }

    @Override // p000.so7
    public final Object get() {
        int i = this.f48425a;
        so7 so7Var = this.f48426b;
        switch (i) {
            case 0:
                String packageName = ((Context) so7Var.get()).getPackageName();
                if (packageName != null) {
                    return packageName;
                }
                C3386nv.m17635v("Cannot return null from a non-@Nullable @Provides method");
                return null;
            default:
                return new an8(Integer.valueOf(an8.f892d).intValue(), (Context) so7Var.get(), "com.google.android.datatransport.events");
        }
    }
}
