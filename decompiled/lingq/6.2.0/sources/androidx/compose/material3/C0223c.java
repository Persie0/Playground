package androidx.compose.material3;

import p000.ui3;
import p000.un1;
import p000.wfb;

/* JADX INFO: renamed from: androidx.compose.material3.c */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C0223c implements ui3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f3380a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ un1 f3381b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f3382c;

    public /* synthetic */ C0223c(Object obj, un1 un1Var, int i) {
        this.f3380a = i;
        this.f3382c = obj;
        this.f3381b = un1Var;
    }

    @Override // p000.ui3
    /* JADX INFO: renamed from: a */
    public final Object mo0a() {
        int i = this.f3380a;
        un1 un1Var = this.f3381b;
        Object obj = this.f3382c;
        switch (i) {
            case 0:
                C0269z c0269z = (C0269z) obj;
                if (((Boolean) c0269z.f3649c.invoke(SheetValue.PartiallyExpanded)).booleanValue()) {
                    wfb.m23926u(un1Var, null, null, new BottomSheetKt$BottomSheetImpl$6$1$2$1$1$3$1(c0269z, null), 3);
                }
                break;
            default:
                C0253l c0253l = (C0253l) obj;
                if (((Boolean) c0253l.f3551a.invoke(DrawerValue.Closed)).booleanValue()) {
                    wfb.m23926u(un1Var, null, null, new NavigationDrawerKt$ModalNavigationDrawer$3$4$1$1$1(c0253l, null), 3);
                }
                break;
        }
        return Boolean.TRUE;
    }
}
