package androidx.compose.foundation;

import ae.C0062b;
import android.content.Context;
import android.graphics.Canvas;
import android.os.Build;
import android.widget.EdgeEffect;
import androidx.compose.p017ui.InterfaceC0500b;
import androidx.compose.p017ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.p017ui.platform.C0661s0;
import androidx.compose.p017ui.platform.InspectableValueKt;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import cm.InterfaceC2052l;
import cm.InterfaceC2056p;
import dm.C5207g;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import p060d1.C5027n;
import p081e0.C5314h0;
import p127g1.C5659w;
import p260m8.C7499b;
import p338qd.C8573r0;
import p338qd.C8584v;
import p375s0.C8941c;
import p375s0.C8944f;
import p385sf.C9000b;
import p386t.C9109a;
import p386t.C9117i;
import p386t.C9118j;
import p386t.C9124p;
import p386t.C9131w;
import p386t.InterfaceC9132x;
import p424v0.InterfaceC9621e;
import p464wl.InterfaceC9968c;
import p470x1.C10022j;
import p470x1.C10025m;
import sl.C9072e;

/* JADX INFO: loaded from: classes.dex */
public final class AndroidEdgeEffectOverscrollEffect implements InterfaceC9132x {

    /* JADX INFO: renamed from: a */
    public final C9131w f1669a;

    /* JADX INFO: renamed from: b */
    public C8941c f1670b;

    /* JADX INFO: renamed from: c */
    public final EdgeEffect f1671c;

    /* JADX INFO: renamed from: d */
    public final EdgeEffect f1672d;

    /* JADX INFO: renamed from: e */
    public final EdgeEffect f1673e;

    /* JADX INFO: renamed from: f */
    public final EdgeEffect f1674f;

    /* JADX INFO: renamed from: g */
    public final List<EdgeEffect> f1675g;

    /* JADX INFO: renamed from: h */
    public final EdgeEffect f1676h;

    /* JADX INFO: renamed from: i */
    public final EdgeEffect f1677i;

    /* JADX INFO: renamed from: j */
    public final EdgeEffect f1678j;

    /* JADX INFO: renamed from: k */
    public final EdgeEffect f1679k;

    /* JADX INFO: renamed from: l */
    public final ParcelableSnapshotMutableState f1680l;

    /* JADX INFO: renamed from: m */
    public final boolean f1681m;

    /* JADX INFO: renamed from: n */
    public boolean f1682n;

    /* JADX INFO: renamed from: o */
    public long f1683o;

    /* JADX INFO: renamed from: p */
    public final InterfaceC2052l<C10022j, C9072e> f1684p;

    /* JADX INFO: renamed from: q */
    public C5027n f1685q;

    /* JADX INFO: renamed from: r */
    public final InterfaceC0500b f1686r;

    public AndroidEdgeEffectOverscrollEffect(Context context, C9131w c9131w) {
        C5207g.m11111f(context, "context");
        this.f1669a = c9131w;
        EdgeEffect edgeEffectM17360a = C9118j.m17360a(context);
        this.f1671c = edgeEffectM17360a;
        EdgeEffect edgeEffectM17360a2 = C9118j.m17360a(context);
        this.f1672d = edgeEffectM17360a2;
        EdgeEffect edgeEffectM17360a3 = C9118j.m17360a(context);
        this.f1673e = edgeEffectM17360a3;
        EdgeEffect edgeEffectM17360a4 = C9118j.m17360a(context);
        this.f1674f = edgeEffectM17360a4;
        List<EdgeEffect> listM17252r = C9000b.m17252r(edgeEffectM17360a3, edgeEffectM17360a, edgeEffectM17360a4, edgeEffectM17360a2);
        this.f1675g = listM17252r;
        this.f1676h = C9118j.m17360a(context);
        this.f1677i = C9118j.m17360a(context);
        this.f1678j = C9118j.m17360a(context);
        this.f1679k = C9118j.m17360a(context);
        int size = listM17252r.size();
        for (int i10 = 0; i10 < size; i10++) {
            listM17252r.get(i10).setColor(C8584v.m16780C(this.f1669a.f47639a));
        }
        C9072e c9072e = C9072e.f47360a;
        this.f1680l = C8573r0.m16682K0(c9072e, C5314h0.f33585a);
        this.f1681m = true;
        this.f1683o = C8944f.f46906b;
        InterfaceC2052l<C10022j, C9072e> interfaceC2052l = new InterfaceC2052l<C10022j, C9072e>() { // from class: androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect$onNewSize$1
            {
                super(1);
            }

            @Override // cm.InterfaceC2052l
            /* JADX INFO: renamed from: n */
            public final C9072e mo528n(C10022j c10022j) {
                long j10 = c10022j.f50980a;
                long jM17259y = C9000b.m17259y(j10);
                AndroidEdgeEffectOverscrollEffect androidEdgeEffectOverscrollEffect = this.f1698b;
                boolean z10 = !C8944f.m17174a(jM17259y, androidEdgeEffectOverscrollEffect.f1683o);
                androidEdgeEffectOverscrollEffect.f1683o = C9000b.m17259y(j10);
                if (z10) {
                    int i11 = (int) (j10 >> 32);
                    androidEdgeEffectOverscrollEffect.f1671c.setSize(i11, C10022j.m18628b(j10));
                    androidEdgeEffectOverscrollEffect.f1672d.setSize(i11, C10022j.m18628b(j10));
                    androidEdgeEffectOverscrollEffect.f1673e.setSize(C10022j.m18628b(j10), i11);
                    androidEdgeEffectOverscrollEffect.f1674f.setSize(C10022j.m18628b(j10), i11);
                    androidEdgeEffectOverscrollEffect.f1676h.setSize(i11, C10022j.m18628b(j10));
                    androidEdgeEffectOverscrollEffect.f1677i.setSize(i11, C10022j.m18628b(j10));
                    androidEdgeEffectOverscrollEffect.f1678j.setSize(C10022j.m18628b(j10), i11);
                    androidEdgeEffectOverscrollEffect.f1679k.setSize(C10022j.m18628b(j10), i11);
                }
                if (z10) {
                    androidEdgeEffectOverscrollEffect.m1402i();
                    androidEdgeEffectOverscrollEffect.m1398e();
                }
                return C9072e.f47360a;
            }
        };
        this.f1684p = interfaceC2052l;
        InterfaceC0500b interfaceC0500b = AndroidOverscrollKt.f1699a;
        C5207g.m11111f(interfaceC0500b, "other");
        InterfaceC0500b interfaceC0500bM2032a = SuspendingPointerInputFilterKt.m2032a(interfaceC0500b, c9072e, new AndroidEdgeEffectOverscrollEffect$effectModifier$1(this, null));
        C5207g.m11111f(interfaceC0500bM2032a, "<this>");
        InterfaceC2052l<C0661s0, C9072e> interfaceC2052l2 = InspectableValueKt.f4184a;
        this.f1686r = interfaceC0500bM2032a.mo1929K(new C5659w(interfaceC2052l, interfaceC2052l2)).mo1929K(new C9117i(this, interfaceC2052l2));
    }

    @Override // p386t.InterfaceC9132x
    /* JADX INFO: renamed from: a */
    public final InterfaceC0500b mo1394a() {
        return this.f1686r;
    }

    /* JADX WARN: Code duplicated, block: B:109:0x019c  */
    /* JADX WARN: Code duplicated, block: B:115:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:117:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:125:0x01ea  */
    /* JADX WARN: Code duplicated, block: B:131:0x0209  */
    /* JADX WARN: Code duplicated, block: B:133:0x0211  */
    /* JADX WARN: Code duplicated, block: B:142:0x0237  */
    /* JADX WARN: Code duplicated, block: B:144:0x023a  */
    /* JADX WARN: Code duplicated, block: B:41:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:43:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:45:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:46:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:49:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:50:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:52:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:59:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:78:0x0123  */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Code duplicated, block: B:80:0x012b  */
    /* JADX WARN: Code duplicated, block: B:82:0x0134  */
    /* JADX WARN: Code duplicated, block: B:83:0x0139  */
    /* JADX WARN: Code duplicated, block: B:86:0x013e  */
    /* JADX WARN: Code duplicated, block: B:87:0x0140  */
    /* JADX WARN: Code duplicated, block: B:89:0x0143  */
    /* JADX WARN: Code duplicated, block: B:96:0x0160  */
    @Override // p386t.InterfaceC9132x
    /* JADX INFO: renamed from: b */
    public final Object mo1395b(long j10, InterfaceC2056p<? super C10025m, ? super InterfaceC9968c<? super C10025m>, ? extends Object> interfaceC2056p, InterfaceC9968c<? super C9072e> interfaceC9968c) throws Throwable {
        AndroidEdgeEffectOverscrollEffect$applyToFling$1 androidEdgeEffectOverscrollEffect$applyToFling$1;
        float fM18636b;
        EdgeEffect edgeEffect;
        int i10;
        float fM17357b;
        boolean z10;
        int i11;
        float fM18637c;
        EdgeEffect edgeEffect2;
        int i12;
        float fM17357b2;
        boolean z11;
        int i13;
        long jM18638d;
        AndroidEdgeEffectOverscrollEffect androidEdgeEffectOverscrollEffect;
        long jM18638d2;
        int i14;
        EdgeEffect edgeEffect3;
        int i15;
        EdgeEffect edgeEffect4;
        int iM16710Y0;
        EdgeEffect edgeEffect5;
        int iM16710Y1;
        EdgeEffect edgeEffect6;
        if (interfaceC9968c instanceof AndroidEdgeEffectOverscrollEffect$applyToFling$1) {
            androidEdgeEffectOverscrollEffect$applyToFling$1 = (AndroidEdgeEffectOverscrollEffect$applyToFling$1) interfaceC9968c;
            int i16 = androidEdgeEffectOverscrollEffect$applyToFling$1.f1691h;
            if ((i16 & Integer.MIN_VALUE) != 0) {
                androidEdgeEffectOverscrollEffect$applyToFling$1.f1691h = i16 - Integer.MIN_VALUE;
            } else {
                androidEdgeEffectOverscrollEffect$applyToFling$1 = new AndroidEdgeEffectOverscrollEffect$applyToFling$1(this, interfaceC9968c);
            }
        } else {
            androidEdgeEffectOverscrollEffect$applyToFling$1 = new AndroidEdgeEffectOverscrollEffect$applyToFling$1(this, interfaceC9968c);
        }
        Object objMo1337m0 = androidEdgeEffectOverscrollEffect$applyToFling$1.f1689f;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i17 = androidEdgeEffectOverscrollEffect$applyToFling$1.f1691h;
        if (i17 != 0) {
            if (i17 == 1) {
                C7499b.m14977z0(objMo1337m0);
                return C9072e.f47360a;
            }
            if (i17 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jM18638d = androidEdgeEffectOverscrollEffect$applyToFling$1.f1688e;
            androidEdgeEffectOverscrollEffect = androidEdgeEffectOverscrollEffect$applyToFling$1.f1687d;
            C7499b.m14977z0(objMo1337m0);
            jM18638d2 = C10025m.m18638d(jM18638d, ((C10025m) objMo1337m0).f50987a);
            androidEdgeEffectOverscrollEffect.f1682n = false;
            if (C10025m.m18636b(jM18638d2) > 0.0f) {
                iM16710Y1 = C8573r0.m16710Y0(C10025m.m18636b(jM18638d2));
                edgeEffect6 = androidEdgeEffectOverscrollEffect.f1673e;
                C5207g.m11111f(edgeEffect6, "<this>");
                if (Build.VERSION.SDK_INT < 31 || edgeEffect6.isFinished()) {
                    edgeEffect6.onAbsorb(iM16710Y1);
                }
            } else if (C10025m.m18636b(jM18638d2) < 0.0f) {
                i14 = -C8573r0.m16710Y0(C10025m.m18636b(jM18638d2));
                edgeEffect3 = androidEdgeEffectOverscrollEffect.f1674f;
                C5207g.m11111f(edgeEffect3, "<this>");
                if (Build.VERSION.SDK_INT < 31 || edgeEffect3.isFinished()) {
                    edgeEffect3.onAbsorb(i14);
                }
            }
            if (C10025m.m18637c(jM18638d2) > 0.0f) {
                iM16710Y0 = C8573r0.m16710Y0(C10025m.m18637c(jM18638d2));
                edgeEffect5 = androidEdgeEffectOverscrollEffect.f1671c;
                C5207g.m11111f(edgeEffect5, "<this>");
                if (Build.VERSION.SDK_INT < 31 || edgeEffect5.isFinished()) {
                    edgeEffect5.onAbsorb(iM16710Y0);
                }
            } else if (C10025m.m18637c(jM18638d2) < 0.0f) {
                i15 = -C8573r0.m16710Y0(C10025m.m18637c(jM18638d2));
                edgeEffect4 = androidEdgeEffectOverscrollEffect.f1672d;
                C5207g.m11111f(edgeEffect4, "<this>");
                if (Build.VERSION.SDK_INT < 31 || edgeEffect4.isFinished()) {
                    edgeEffect4.onAbsorb(i15);
                }
            }
            if (!(jM18638d2 == C10025m.f50985b)) {
                androidEdgeEffectOverscrollEffect.m1402i();
            }
            androidEdgeEffectOverscrollEffect.m1398e();
            return C9072e.f47360a;
        }
        C7499b.m14977z0(objMo1337m0);
        if (C8944f.m17178e(this.f1683o)) {
            C10025m c10025m = new C10025m(j10);
            androidEdgeEffectOverscrollEffect$applyToFling$1.f1691h = 1;
            if (interfaceC2056p.mo1337m0(c10025m, androidEdgeEffectOverscrollEffect$applyToFling$1) == coroutineSingletons) {
                return coroutineSingletons;
            }
            return C9072e.f47360a;
        }
        float fM18636b2 = C10025m.m18636b(j10);
        C9109a c9109a = C9109a.f47596a;
        if (fM18636b2 > 0.0f) {
            EdgeEffect edgeEffect7 = this.f1673e;
            C5207g.m11111f(edgeEffect7, "<this>");
            int i18 = Build.VERSION.SDK_INT;
            if (!((i18 >= 31 ? c9109a.m17357b(edgeEffect7) : 0.0f) == 0.0f)) {
                int iM16710Y2 = C8573r0.m16710Y0(C10025m.m18636b(j10));
                if (i18 >= 31 || edgeEffect7.isFinished()) {
                    edgeEffect7.onAbsorb(iM16710Y2);
                }
                fM18636b = C10025m.m18636b(j10);
            } else if (C10025m.m18636b(j10) < 0.0f) {
                edgeEffect = this.f1674f;
                C5207g.m11111f(edgeEffect, "<this>");
                i10 = Build.VERSION.SDK_INT;
                if (i10 >= 31) {
                    fM17357b = c9109a.m17357b(edgeEffect);
                } else {
                    fM17357b = 0.0f;
                }
                if (fM17357b == 0.0f) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    fM18636b = 0.0f;
                } else {
                    i11 = -C8573r0.m16710Y0(C10025m.m18636b(j10));
                    if (i10 < 31 || edgeEffect.isFinished()) {
                        edgeEffect.onAbsorb(i11);
                    }
                    fM18636b = C10025m.m18636b(j10);
                }
            } else {
                fM18636b = 0.0f;
            }
        } else if (C10025m.m18636b(j10) < 0.0f) {
            edgeEffect = this.f1674f;
            C5207g.m11111f(edgeEffect, "<this>");
            i10 = Build.VERSION.SDK_INT;
            if (i10 >= 31) {
                fM17357b = c9109a.m17357b(edgeEffect);
            } else {
                fM17357b = 0.0f;
            }
            if (fM17357b == 0.0f) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                i11 = -C8573r0.m16710Y0(C10025m.m18636b(j10));
                if (i10 < 31) {
                    edgeEffect.onAbsorb(i11);
                } else {
                    edgeEffect.onAbsorb(i11);
                }
                fM18636b = C10025m.m18636b(j10);
            } else {
                fM18636b = 0.0f;
            }
        } else {
            fM18636b = 0.0f;
        }
        if (C10025m.m18637c(j10) > 0.0f) {
            EdgeEffect edgeEffect8 = this.f1671c;
            C5207g.m11111f(edgeEffect8, "<this>");
            int i19 = Build.VERSION.SDK_INT;
            if (!((i19 >= 31 ? c9109a.m17357b(edgeEffect8) : 0.0f) == 0.0f)) {
                int iM16710Y3 = C8573r0.m16710Y0(C10025m.m18637c(j10));
                if (i19 >= 31 || edgeEffect8.isFinished()) {
                    edgeEffect8.onAbsorb(iM16710Y3);
                }
                fM18637c = C10025m.m18637c(j10);
            } else if (C10025m.m18637c(j10) < 0.0f) {
                edgeEffect2 = this.f1672d;
                C5207g.m11111f(edgeEffect2, "<this>");
                i12 = Build.VERSION.SDK_INT;
                if (i12 >= 31) {
                    fM17357b2 = c9109a.m17357b(edgeEffect2);
                } else {
                    fM17357b2 = 0.0f;
                }
                if (fM17357b2 == 0.0f) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z11) {
                    fM18637c = 0.0f;
                } else {
                    i13 = -C8573r0.m16710Y0(C10025m.m18637c(j10));
                    if (i12 < 31 || edgeEffect2.isFinished()) {
                        edgeEffect2.onAbsorb(i13);
                    }
                    fM18637c = C10025m.m18637c(j10);
                }
            } else {
                fM18637c = 0.0f;
            }
        } else if (C10025m.m18637c(j10) < 0.0f) {
            edgeEffect2 = this.f1672d;
            C5207g.m11111f(edgeEffect2, "<this>");
            i12 = Build.VERSION.SDK_INT;
            if (i12 >= 31) {
                fM17357b2 = c9109a.m17357b(edgeEffect2);
            } else {
                fM17357b2 = 0.0f;
            }
            if (fM17357b2 == 0.0f) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                i13 = -C8573r0.m16710Y0(C10025m.m18637c(j10));
                if (i12 < 31) {
                    edgeEffect2.onAbsorb(i13);
                } else {
                    edgeEffect2.onAbsorb(i13);
                }
                fM18637c = C10025m.m18637c(j10);
            } else {
                fM18637c = 0.0f;
            }
        } else {
            fM18637c = 0.0f;
        }
        long jM388r = C0062b.m388r(fM18636b, fM18637c);
        if (!(jM388r == C10025m.f50985b)) {
            m1402i();
        }
        jM18638d = C10025m.m18638d(j10, jM388r);
        C10025m c10025m2 = new C10025m(jM18638d);
        androidEdgeEffectOverscrollEffect$applyToFling$1.f1687d = this;
        androidEdgeEffectOverscrollEffect$applyToFling$1.f1688e = jM18638d;
        androidEdgeEffectOverscrollEffect$applyToFling$1.f1691h = 2;
        objMo1337m0 = interfaceC2056p.mo1337m0(c10025m2, androidEdgeEffectOverscrollEffect$applyToFling$1);
        if (objMo1337m0 == coroutineSingletons) {
            return coroutineSingletons;
        }
        androidEdgeEffectOverscrollEffect = this;
        jM18638d2 = C10025m.m18638d(jM18638d, ((C10025m) objMo1337m0).f50987a);
        androidEdgeEffectOverscrollEffect.f1682n = false;
        if (C10025m.m18636b(jM18638d2) > 0.0f) {
            iM16710Y1 = C8573r0.m16710Y0(C10025m.m18636b(jM18638d2));
            edgeEffect6 = androidEdgeEffectOverscrollEffect.f1673e;
            C5207g.m11111f(edgeEffect6, "<this>");
            if (Build.VERSION.SDK_INT < 31) {
                edgeEffect6.onAbsorb(iM16710Y1);
            } else {
                edgeEffect6.onAbsorb(iM16710Y1);
            }
        } else if (C10025m.m18636b(jM18638d2) < 0.0f) {
            i14 = -C8573r0.m16710Y0(C10025m.m18636b(jM18638d2));
            edgeEffect3 = androidEdgeEffectOverscrollEffect.f1674f;
            C5207g.m11111f(edgeEffect3, "<this>");
            if (Build.VERSION.SDK_INT < 31) {
                edgeEffect3.onAbsorb(i14);
            } else {
                edgeEffect3.onAbsorb(i14);
            }
        }
        if (C10025m.m18637c(jM18638d2) > 0.0f) {
            iM16710Y0 = C8573r0.m16710Y0(C10025m.m18637c(jM18638d2));
            edgeEffect5 = androidEdgeEffectOverscrollEffect.f1671c;
            C5207g.m11111f(edgeEffect5, "<this>");
            if (Build.VERSION.SDK_INT < 31) {
                edgeEffect5.onAbsorb(iM16710Y0);
            } else {
                edgeEffect5.onAbsorb(iM16710Y0);
            }
        } else if (C10025m.m18637c(jM18638d2) < 0.0f) {
            i15 = -C8573r0.m16710Y0(C10025m.m18637c(jM18638d2));
            edgeEffect4 = androidEdgeEffectOverscrollEffect.f1672d;
            C5207g.m11111f(edgeEffect4, "<this>");
            if (Build.VERSION.SDK_INT < 31) {
                edgeEffect4.onAbsorb(i15);
            } else {
                edgeEffect4.onAbsorb(i15);
            }
        }
        if (!(jM18638d2 == C10025m.f50985b)) {
            androidEdgeEffectOverscrollEffect.m1402i();
        }
        androidEdgeEffectOverscrollEffect.m1398e();
        return C9072e.f47360a;
    }

    /* JADX WARN: Code duplicated, block: B:113:0x018c  */
    /* JADX WARN: Code duplicated, block: B:114:0x0190  */
    /* JADX WARN: Code duplicated, block: B:116:0x0198  */
    /* JADX WARN: Code duplicated, block: B:118:0x019d  */
    /* JADX WARN: Code duplicated, block: B:120:0x01a1 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:122:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:65:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:94:0x0134  */
    @Override // p386t.InterfaceC9132x
    /* JADX INFO: renamed from: c */
    public final long mo1396c(long j10, int i10, InterfaceC2052l<? super C8941c, C8941c> interfaceC2052l) {
        float fM1403j;
        float fM1405l;
        boolean z10;
        boolean zIsFinished;
        boolean z11;
        boolean z12;
        if (C8944f.m17178e(this.f1683o)) {
            return interfaceC2052l.mo528n(new C8941c(j10)).f46892a;
        }
        boolean z13 = this.f1682n;
        boolean z14 = true;
        EdgeEffect edgeEffect = this.f1672d;
        EdgeEffect edgeEffect2 = this.f1671c;
        EdgeEffect edgeEffect3 = this.f1674f;
        EdgeEffect edgeEffect4 = this.f1673e;
        if (!z13) {
            long jM16794s = C8584v.m16794s(this.f1683o);
            if (!(C9118j.m17361b(edgeEffect4) == 0.0f)) {
                m1404k(C8941c.f46888b, jM16794s);
            }
            if (!(C9118j.m17361b(edgeEffect3) == 0.0f)) {
                m1405l(C8941c.f46888b, jM16794s);
            }
            if (!(C9118j.m17361b(edgeEffect2) == 0.0f)) {
                m1406m(C8941c.f46888b, jM16794s);
            }
            if (!(C9118j.m17361b(edgeEffect) == 0.0f)) {
                m1403j(C8941c.f46888b, jM16794s);
            }
            this.f1682n = true;
        }
        C8941c c8941c = this.f1670b;
        long jM16794s2 = c8941c != null ? c8941c.f46892a : C8584v.m16794s(this.f1683o);
        if (C8941c.m17165d(j10) == 0.0f) {
            fM1403j = 0.0f;
        } else {
            if (C9118j.m17361b(edgeEffect2) == 0.0f) {
                if (C9118j.m17361b(edgeEffect) == 0.0f) {
                    fM1403j = 0.0f;
                } else {
                    fM1403j = m1403j(j10, jM16794s2);
                    if (C9118j.m17361b(edgeEffect) == 0.0f) {
                        edgeEffect.onRelease();
                    }
                }
            } else {
                fM1403j = m1406m(j10, jM16794s2);
                if (C9118j.m17361b(edgeEffect2) == 0.0f) {
                    edgeEffect2.onRelease();
                }
            }
        }
        if (C8941c.m17164c(j10) == 0.0f) {
            fM1405l = 0.0f;
        } else {
            if (C9118j.m17361b(edgeEffect4) == 0.0f) {
                if (C9118j.m17361b(edgeEffect3) == 0.0f) {
                    fM1405l = 0.0f;
                } else {
                    fM1405l = m1405l(j10, jM16794s2);
                    if (C9118j.m17361b(edgeEffect3) == 0.0f) {
                        edgeEffect3.onRelease();
                    }
                }
            } else {
                fM1405l = m1404k(j10, jM16794s2);
                if (C9118j.m17361b(edgeEffect4) == 0.0f) {
                    edgeEffect4.onRelease();
                }
            }
        }
        long jM14932c = C7499b.m14932c(fM1405l, fM1403j);
        if (!C8941c.m17162a(jM14932c, C8941c.f46888b)) {
            m1402i();
        }
        long jM17166e = C8941c.m17166e(j10, jM14932c);
        long j11 = interfaceC2052l.mo528n(new C8941c(jM17166e)).f46892a;
        long jM17166e2 = C8941c.m17166e(jM17166e, j11);
        if (i10 == 1) {
            if (C8941c.m17164c(jM17166e2) > 0.5f) {
                m1404k(jM17166e2, jM16794s2);
            } else {
                if (C8941c.m17164c(jM17166e2) < -0.5f) {
                    m1405l(jM17166e2, jM16794s2);
                } else {
                    z11 = false;
                }
                if (C8941c.m17165d(jM17166e2) > 0.5f) {
                    m1406m(jM17166e2, jM16794s2);
                } else {
                    if (C8941c.m17165d(jM17166e2) < -0.5f) {
                        m1403j(jM17166e2, jM16794s2);
                    } else {
                        z12 = false;
                    }
                    if (!z11 || z12) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                }
                z12 = true;
                if (z11) {
                }
                z10 = true;
            }
            z11 = true;
            if (C8941c.m17165d(jM17166e2) > 0.5f) {
                m1406m(jM17166e2, jM16794s2);
            } else {
                if (C8941c.m17165d(jM17166e2) < -0.5f) {
                    m1403j(jM17166e2, jM16794s2);
                } else {
                    z12 = false;
                }
                if (z11) {
                }
                z10 = true;
            }
            z12 = true;
            if (z11) {
            }
            z10 = true;
        } else {
            z10 = false;
        }
        if (edgeEffect4.isFinished() || C8941c.m17164c(j10) >= 0.0f) {
            zIsFinished = false;
        } else {
            float fM17164c = C8941c.m17164c(j10);
            if (edgeEffect4 instanceof C9124p) {
                C9124p c9124p = (C9124p) edgeEffect4;
                float f3 = c9124p.f47632b + fM17164c;
                c9124p.f47632b = f3;
                if (Math.abs(f3) > c9124p.f47631a) {
                    c9124p.onRelease();
                }
            } else {
                edgeEffect4.onRelease();
            }
            zIsFinished = edgeEffect4.isFinished();
        }
        if (!edgeEffect3.isFinished() && C8941c.m17164c(j10) > 0.0f) {
            float fM17164c2 = C8941c.m17164c(j10);
            if (edgeEffect3 instanceof C9124p) {
                C9124p c9124p2 = (C9124p) edgeEffect3;
                float f10 = c9124p2.f47632b + fM17164c2;
                c9124p2.f47632b = f10;
                if (Math.abs(f10) > c9124p2.f47631a) {
                    c9124p2.onRelease();
                }
            } else {
                edgeEffect3.onRelease();
            }
            zIsFinished = zIsFinished || edgeEffect3.isFinished();
        }
        if (!edgeEffect2.isFinished() && C8941c.m17165d(j10) < 0.0f) {
            float fM17165d = C8941c.m17165d(j10);
            if (edgeEffect2 instanceof C9124p) {
                C9124p c9124p3 = (C9124p) edgeEffect2;
                float f11 = c9124p3.f47632b + fM17165d;
                c9124p3.f47632b = f11;
                if (Math.abs(f11) > c9124p3.f47631a) {
                    c9124p3.onRelease();
                }
            } else {
                edgeEffect2.onRelease();
            }
            zIsFinished = zIsFinished || edgeEffect2.isFinished();
        }
        if (!edgeEffect.isFinished() && C8941c.m17165d(j10) > 0.0f) {
            float fM17165d2 = C8941c.m17165d(j10);
            if (edgeEffect instanceof C9124p) {
                C9124p c9124p4 = (C9124p) edgeEffect;
                float f12 = c9124p4.f47632b + fM17165d2;
                c9124p4.f47632b = f12;
                if (Math.abs(f12) > c9124p4.f47631a) {
                    c9124p4.onRelease();
                }
            } else {
                edgeEffect.onRelease();
            }
            zIsFinished = zIsFinished || edgeEffect.isFinished();
        }
        if (!zIsFinished && !z10) {
            z14 = false;
        }
        if (z14) {
            m1402i();
        }
        return C8941c.m17167f(jM14932c, j11);
    }

    @Override // p386t.InterfaceC9132x
    /* JADX INFO: renamed from: d */
    public final boolean mo1397d() {
        List<EdgeEffect> list = this.f1675g;
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            EdgeEffect edgeEffect = list.get(i10);
            C5207g.m11111f(edgeEffect, "<this>");
            if (!((Build.VERSION.SDK_INT >= 31 ? C9109a.f47596a.m17357b(edgeEffect) : 0.0f) == 0.0f)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: e */
    public final void m1398e() {
        List<EdgeEffect> list = this.f1675g;
        int size = list.size();
        boolean z10 = false;
        for (int i10 = 0; i10 < size; i10++) {
            EdgeEffect edgeEffect = list.get(i10);
            edgeEffect.onRelease();
            z10 = edgeEffect.isFinished() || z10;
        }
        if (z10) {
            m1402i();
        }
    }

    /* JADX INFO: renamed from: f */
    public final boolean m1399f(InterfaceC9621e interfaceC9621e, EdgeEffect edgeEffect, Canvas canvas) {
        int iSave = canvas.save();
        canvas.rotate(180.0f);
        canvas.translate(-C8944f.m17177d(this.f1683o), (-C8944f.m17175b(this.f1683o)) + interfaceC9621e.mo1463i0(this.f1669a.f47640b.mo18274a()));
        boolean zDraw = edgeEffect.draw(canvas);
        canvas.restoreToCount(iSave);
        return zDraw;
    }

    /* JADX INFO: renamed from: g */
    public final boolean m1400g(InterfaceC9621e interfaceC9621e, EdgeEffect edgeEffect, Canvas canvas) {
        int iSave = canvas.save();
        canvas.rotate(270.0f);
        canvas.translate(-C8944f.m17175b(this.f1683o), interfaceC9621e.mo1463i0(this.f1669a.f47640b.mo18275b(interfaceC9621e.getLayoutDirection())));
        boolean zDraw = edgeEffect.draw(canvas);
        canvas.restoreToCount(iSave);
        return zDraw;
    }

    /* JADX INFO: renamed from: h */
    public final boolean m1401h(InterfaceC9621e interfaceC9621e, EdgeEffect edgeEffect, Canvas canvas) {
        int iSave = canvas.save();
        int iM16710Y0 = C8573r0.m16710Y0(C8944f.m17177d(this.f1683o));
        float fMo18276c = this.f1669a.f47640b.mo18276c(interfaceC9621e.getLayoutDirection());
        canvas.rotate(90.0f);
        canvas.translate(0.0f, interfaceC9621e.mo1463i0(fMo18276c) + (-iM16710Y0));
        boolean zDraw = edgeEffect.draw(canvas);
        canvas.restoreToCount(iSave);
        return zDraw;
    }

    /* JADX INFO: renamed from: i */
    public final void m1402i() {
        if (this.f1681m) {
            this.f1680l.setValue(C9072e.f47360a);
        }
    }

    /* JADX INFO: renamed from: j */
    public final float m1403j(long j10, long j11) {
        float fM17164c = C8941c.m17164c(j11) / C8944f.m17177d(this.f1683o);
        float fM17358c = -(C8941c.m17165d(j10) / C8944f.m17175b(this.f1683o));
        boolean z10 = true;
        float f3 = 1 - fM17164c;
        EdgeEffect edgeEffect = this.f1672d;
        C5207g.m11111f(edgeEffect, "<this>");
        int i10 = Build.VERSION.SDK_INT;
        C9109a c9109a = C9109a.f47596a;
        if (i10 >= 31) {
            fM17358c = c9109a.m17358c(edgeEffect, fM17358c, f3);
        } else {
            edgeEffect.onPull(fM17358c, f3);
        }
        float fM17175b = C8944f.m17175b(this.f1683o) * (-fM17358c);
        C5207g.m11111f(edgeEffect, "<this>");
        if ((Build.VERSION.SDK_INT >= 31 ? c9109a.m17357b(edgeEffect) : 0.0f) != 0.0f) {
            z10 = false;
        }
        if (!z10) {
            fM17175b = C8941c.m17165d(j10);
        }
        return fM17175b;
    }

    /* JADX INFO: renamed from: k */
    public final float m1404k(long j10, long j11) {
        float fM17165d = C8941c.m17165d(j11) / C8944f.m17175b(this.f1683o);
        float fM17164c = C8941c.m17164c(j10) / C8944f.m17177d(this.f1683o);
        boolean z10 = true;
        float f3 = 1 - fM17165d;
        EdgeEffect edgeEffect = this.f1673e;
        C5207g.m11111f(edgeEffect, "<this>");
        int i10 = Build.VERSION.SDK_INT;
        C9109a c9109a = C9109a.f47596a;
        if (i10 >= 31) {
            fM17164c = c9109a.m17358c(edgeEffect, fM17164c, f3);
        } else {
            edgeEffect.onPull(fM17164c, f3);
        }
        float fM17177d = C8944f.m17177d(this.f1683o) * fM17164c;
        C5207g.m11111f(edgeEffect, "<this>");
        if ((Build.VERSION.SDK_INT >= 31 ? c9109a.m17357b(edgeEffect) : 0.0f) != 0.0f) {
            z10 = false;
        }
        if (!z10) {
            fM17177d = C8941c.m17164c(j10);
        }
        return fM17177d;
    }

    /* JADX INFO: renamed from: l */
    public final float m1405l(long j10, long j11) {
        float fM17165d = C8941c.m17165d(j11) / C8944f.m17175b(this.f1683o);
        float fM17358c = -(C8941c.m17164c(j10) / C8944f.m17177d(this.f1683o));
        EdgeEffect edgeEffect = this.f1674f;
        C5207g.m11111f(edgeEffect, "<this>");
        int i10 = Build.VERSION.SDK_INT;
        C9109a c9109a = C9109a.f47596a;
        if (i10 >= 31) {
            fM17358c = c9109a.m17358c(edgeEffect, fM17358c, fM17165d);
        } else {
            edgeEffect.onPull(fM17358c, fM17165d);
        }
        float fM17177d = C8944f.m17177d(this.f1683o) * (-fM17358c);
        C5207g.m11111f(edgeEffect, "<this>");
        return !(((Build.VERSION.SDK_INT >= 31 ? c9109a.m17357b(edgeEffect) : 0.0f) > 0.0f ? 1 : ((Build.VERSION.SDK_INT >= 31 ? c9109a.m17357b(edgeEffect) : 0.0f) == 0.0f ? 0 : -1)) == 0) ? C8941c.m17164c(j10) : fM17177d;
    }

    /* JADX INFO: renamed from: m */
    public final float m1406m(long j10, long j11) {
        float fM17164c = C8941c.m17164c(j11) / C8944f.m17177d(this.f1683o);
        float fM17165d = C8941c.m17165d(j10) / C8944f.m17175b(this.f1683o);
        EdgeEffect edgeEffect = this.f1671c;
        C5207g.m11111f(edgeEffect, "<this>");
        int i10 = Build.VERSION.SDK_INT;
        C9109a c9109a = C9109a.f47596a;
        if (i10 >= 31) {
            fM17165d = c9109a.m17358c(edgeEffect, fM17165d, fM17164c);
        } else {
            edgeEffect.onPull(fM17165d, fM17164c);
        }
        float fM17175b = C8944f.m17175b(this.f1683o) * fM17165d;
        C5207g.m11111f(edgeEffect, "<this>");
        return !(((Build.VERSION.SDK_INT >= 31 ? c9109a.m17357b(edgeEffect) : 0.0f) > 0.0f ? 1 : ((Build.VERSION.SDK_INT >= 31 ? c9109a.m17357b(edgeEffect) : 0.0f) == 0.0f ? 0 : -1)) == 0) ? C8941c.m17165d(j10) : fM17175b;
    }
}
