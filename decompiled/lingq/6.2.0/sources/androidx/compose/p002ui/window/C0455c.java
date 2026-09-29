package androidx.compose.p002ui.window;

import androidx.compose.p002ui.unit.LayoutDirection;
import java.util.List;
import kotlin.collections.AbstractC3194a;
import p000.ht5;
import p000.it5;
import p000.jt5;

/* JADX INFO: renamed from: androidx.compose.ui.window.c */
/* JADX INFO: loaded from: classes2.dex */
public final class C0455c implements ht5 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C0461i f5289a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ LayoutDirection f5290b;

    public C0455c(C0461i c0461i, LayoutDirection layoutDirection) {
        this.f5289a = c0461i;
        this.f5290b = layoutDirection;
    }

    @Override // p000.ht5
    /* JADX INFO: renamed from: b */
    public final it5 mo738b(jt5 jt5Var, List list, long j) {
        this.f5289a.setParentLayoutDirection(this.f5290b);
        return jt5Var.mo9895M0(0, 0, AbstractC3194a.m15360M(), AndroidPopup_androidKt$Popup$8$1$1.f5258b);
    }
}
