package androidx.compose.material3;

import p000.ch0;
import p000.sy0;
import p000.ui3;
import p000.un1;
import p000.wfb;
import p000.wg0;
import p000.xfa;

/* JADX INFO: renamed from: androidx.compose.material3.b */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C0221b implements ui3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f3373a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0269z f3374b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ un1 f3375c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Object f3376d;

    public /* synthetic */ C0221b(un1 un1Var, ui3 ui3Var, C0269z c0269z) {
        this.f3373a = 0;
        this.f3374b = c0269z;
        this.f3376d = ui3Var;
        this.f3375c = un1Var;
    }

    @Override // p000.ui3
    /* JADX INFO: renamed from: a */
    public final Object mo0a() {
        int i = this.f3373a;
        xfa xfaVar = xfa.f68157a;
        Object obj = this.f3376d;
        un1 un1Var = this.f3375c;
        C0269z c0269z = this.f3374b;
        switch (i) {
            case 0:
                ui3 ui3Var = (ui3) obj;
                int i2 = ch0.f10061a[c0269z.m1215c().ordinal()];
                if (i2 == 2) {
                    wfb.m23926u(un1Var, null, null, new BottomSheetKt$BottomSheetImpl$6$1$1$1$1(c0269z, null), 3);
                } else if (i2 != 3) {
                    wfb.m23926u(un1Var, null, null, new BottomSheetKt$BottomSheetImpl$6$1$1$1$2(c0269z, null), 3);
                } else {
                    ui3Var.mo0a();
                }
                return xfaVar;
            case 1:
                ui3 ui3Var2 = (ui3) obj;
                if (((Boolean) c0269z.f3649c.invoke(SheetValue.Hidden)).booleanValue()) {
                    wfb.m23926u(un1Var, null, null, new BottomSheetKt$BottomSheetImpl$animateToDismiss$1$1$1(c0269z, null), 3).mo4540r(new wg0(c0269z, ui3Var2, 0));
                }
                return xfaVar;
            case 2:
                ui3 ui3Var3 = (ui3) obj;
                if (((Boolean) c0269z.f3649c.invoke(SheetValue.Hidden)).booleanValue()) {
                    wfb.m23926u(un1Var, null, null, new ModalBottomSheetKt$ModalBottomSheet$animateToDismiss$1$1$1(c0269z, null), 3).mo4540r(new wg0(c0269z, ui3Var3, 2));
                }
                return xfaVar;
            case 3:
                ui3 ui3Var4 = (ui3) obj;
                if (c0269z.m1215c() == SheetValue.Expanded && c0269z.f3651e.m849c().m130c(SheetValue.PartiallyExpanded)) {
                    wfb.m23926u(un1Var, null, null, new ModalBottomSheetKt$ModalBottomSheet$settleToDismiss$1$1$1(c0269z, null), 3);
                } else {
                    wfb.m23926u(un1Var, null, null, new ModalBottomSheetKt$ModalBottomSheet$settleToDismiss$1$1$2(c0269z, null), 3).mo4540r(new sy0(2, ui3Var4));
                }
                return xfaVar;
            default:
                C0269z c0269z2 = (C0269z) obj;
                if (((Boolean) c0269z.f3649c.invoke(SheetValue.Expanded)).booleanValue()) {
                    wfb.m23926u(un1Var, null, null, new BottomSheetKt$BottomSheetImpl$6$1$2$1$1$2$1(c0269z2, null), 3);
                }
                return Boolean.TRUE;
        }
    }

    public /* synthetic */ C0221b(C0269z c0269z, un1 un1Var, Object obj, int i) {
        this.f3373a = i;
        this.f3374b = c0269z;
        this.f3375c = un1Var;
        this.f3376d = obj;
    }
}
