package p000;

import android.graphics.RectF;
import androidx.collection.AbstractC0042e;
import androidx.compose.animation.core.C0061c;
import androidx.compose.foundation.text.AbstractC0176d;
import androidx.compose.foundation.text.C0180h;
import androidx.compose.foundation.text.selection.C0205f;
import androidx.compose.material3.AbstractC0257p;
import androidx.compose.p002ui.AbstractC0287b;
import androidx.compose.p002ui.node.C0352b;
import androidx.compose.p002ui.unit.LayoutDirection;
import androidx.compose.runtime.C0281i;
import androidx.compose.runtime.Recomposer$State;
import androidx.compose.runtime.collection.C0275a;
import androidx.compose.runtime.internal.C0282a;
import androidx.datastore.preferences.protobuf.DescriptorProtos;
import androidx.glance.layout.AbstractC0686a;
import com.lingq.feature.library.AbstractC2143d;
import com.lingq.feature.library.C2146e;
import com.lingq.feature.library.LibraryUpdateFragment;
import com.lingq.feature.onboarding.OnboardingStartFragment;
import com.lingq.feature.onboarding.auth.login.C2177b;
import com.lingq.feature.onboarding.auth.login.OnboardingLoginFragment;
import com.lingq.feature.onboarding.domain.LoginAuthType;
import com.lingq.feature.onboarding.p014v2.AbstractC2215c;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import kotlinx.coroutines.flow.internal.SafeCollector;

/* JADX INFO: renamed from: kj */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C3186kj implements zi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f47361a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f47362b;

    public /* synthetic */ C3186kj(Object obj, int i) {
        this.f47361a = i;
        this.f47362b = obj;
    }

    /* JADX WARN: Code duplicated, block: B:132:0x02a6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:133:0x02a8 A[Catch: all -> 0x0296, LOOP:5: B:116:0x0267->B:133:0x02a8, LOOP_END, TryCatch #0 {all -> 0x0296, blocks: (B:109:0x0244, B:111:0x0254, B:113:0x025a, B:116:0x0267, B:118:0x0272, B:120:0x027c, B:122:0x0282, B:124:0x028c, B:129:0x0298, B:130:0x029b, B:133:0x02a8, B:143:0x02d2, B:134:0x02b0, B:135:0x02b6, B:137:0x02bc, B:139:0x02c4, B:142:0x02ce), top: B:331:0x0244 }] */
    /* JADX WARN: Code duplicated, block: B:354:0x02d2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:77:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:89:0x01e2  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        char c;
        yv8 yv8Var;
        Collection collectionM22603U0;
        int i = 4;
        int i2 = 11;
        int i3 = 12;
        char c2 = 7;
        long j = -9187201950435737472L;
        qm0 qm0VarM1284y = null;
        int i4 = 2;
        int i5 = 1;
        switch (this.f47361a) {
            case 0:
                return Boolean.valueOf(((zv9) this.f47362b).mo11824b(bna.m3986y0((RectF) obj), bna.m3986y0((RectF) obj2)));
            case 1:
                aj3 aj3Var = (aj3) this.f47362b;
                ye1 ye1Var = (ye1) obj;
                int iIntValue = ((Integer) obj2).intValue();
                tj3 tj3Var = (tj3) ye1Var;
                if (tj3Var.m22099R(iIntValue & 1, (iIntValue & 3) != 2)) {
                    b16 b16Var = b16.f7762a;
                    bb1 bb1VarM230a = ab1.m230a(eh0.f37238d, nj0.f52791J, tj3Var, 0);
                    int iHashCode = Long.hashCode(tj3Var.f62385T);
                    l77 l77VarM22132m = tj3Var.m22132m();
                    e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var, b16Var);
                    se1.f60731q.getClass();
                    ui3 ui3Var = C0352b.f4299b;
                    tj3Var.m22119f0();
                    if (tj3Var.f62384S) {
                        tj3Var.m22130l(ui3Var);
                    } else {
                        tj3Var.m22137o0();
                    }
                    oha.m18001g(tj3Var, C0352b.f4303f, bb1VarM230a);
                    oha.m18001g(tj3Var, C0352b.f4302e, l77VarM22132m);
                    oha.m18001g(tj3Var, C0352b.f4304g, Integer.valueOf(iHashCode));
                    oha.m18000f(tj3Var, C0352b.f4305h);
                    oha.m18001g(tj3Var, C0352b.f4301d, e16VarM1322c);
                    aj3Var.invoke(db1.f35347a, tj3Var, 6);
                    tj3Var.m22139q(true);
                } else {
                    tj3Var.m22102U();
                }
                return xfa.f68157a;
            case 2:
                v48 v48Var = (v48) this.f47362b;
                ((Integer) obj).getClass();
                if (obj2 instanceof oe1) {
                    oe1 oe1Var = (oe1) obj2;
                    o66 o66Var = (o66) v48Var.f64852i;
                    if (o66Var == null) {
                        o66 o66Var2 = pm8.f56484a;
                        o66Var = new o66();
                        v48Var.f64852i = o66Var;
                    }
                    o66Var.m17818k(oe1Var);
                    ((x66) v48Var.f64849f).m24305c(oe1Var);
                }
                if (obj2 instanceof xj3) {
                    v48Var.m23104g((xj3) obj2);
                }
                if (obj2 instanceof x18) {
                    ((x18) obj2).m24237c();
                }
                return xfa.f68157a;
            case 3:
                ((Integer) obj2).getClass();
                AbstractC0176d.m1071d((C0205f) this.f47362b, (ye1) obj, pk9.m19383z(1));
                return xfa.f68157a;
            case 4:
                o89 o89Var = (o89) this.f47362b;
                ye1 ye1Var2 = (ye1) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                tj3 tj3Var2 = (tj3) ye1Var2;
                if (tj3Var2.m22099R(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    C3549ru c3549ru = eh0.f37237c;
                    fc0 fc0Var = nj0.f52789H;
                    aj3 aj3Var2 = o89Var.f54009g;
                    b16 b16Var2 = b16.f7762a;
                    sj8 sj8VarM20003a = qj8.m20003a(c3549ru, fc0Var, tj3Var2, 54);
                    int iHashCode2 = Long.hashCode(tj3Var2.f62385T);
                    l77 l77VarM22132m2 = tj3Var2.m22132m();
                    e16 e16VarM1322c2 = AbstractC0287b.m1322c(tj3Var2, b16Var2);
                    se1.f60731q.getClass();
                    ui3 ui3Var2 = C0352b.f4299b;
                    tj3Var2.m22119f0();
                    if (tj3Var2.f62384S) {
                        tj3Var2.m22130l(ui3Var2);
                    } else {
                        tj3Var2.m22137o0();
                    }
                    oha.m18001g(tj3Var2, C0352b.f4303f, sj8VarM20003a);
                    oha.m18001g(tj3Var2, C0352b.f4302e, l77VarM22132m2);
                    oha.m18001g(tj3Var2, C0352b.f4304g, Integer.valueOf(iHashCode2));
                    oha.m18000f(tj3Var2, C0352b.f4305h);
                    oha.m18001g(tj3Var2, C0352b.f4301d, e16VarM1322c2);
                    aj3Var2.invoke(vj8.f65508a, tj3Var2, 6);
                    tj3Var2.m22139q(true);
                } else {
                    tj3Var2.m22102U();
                }
                return xfa.f68157a;
            case 5:
                ida idaVar = (ida) this.f47362b;
                ye1 ye1Var3 = (ye1) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                tj3 tj3Var3 = (tj3) ye1Var3;
                if (tj3Var3.m22099R(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    C3549ru c3549ru2 = eh0.f37237c;
                    fc0 fc0Var2 = nj0.f52789H;
                    aj3 aj3Var3 = idaVar.f43999m;
                    b16 b16Var3 = b16.f7762a;
                    sj8 sj8VarM20003a2 = qj8.m20003a(c3549ru2, fc0Var2, tj3Var3, 54);
                    int iHashCode3 = Long.hashCode(tj3Var3.f62385T);
                    l77 l77VarM22132m3 = tj3Var3.m22132m();
                    e16 e16VarM1322c3 = AbstractC0287b.m1322c(tj3Var3, b16Var3);
                    se1.f60731q.getClass();
                    ui3 ui3Var3 = C0352b.f4299b;
                    tj3Var3.m22119f0();
                    if (tj3Var3.f62384S) {
                        tj3Var3.m22130l(ui3Var3);
                    } else {
                        tj3Var3.m22137o0();
                    }
                    oha.m18001g(tj3Var3, C0352b.f4303f, sj8VarM20003a2);
                    oha.m18001g(tj3Var3, C0352b.f4302e, l77VarM22132m3);
                    oha.m18001g(tj3Var3, C0352b.f4304g, Integer.valueOf(iHashCode3));
                    oha.m18000f(tj3Var3, C0352b.f4305h);
                    oha.m18001g(tj3Var3, C0352b.f4301d, e16VarM1322c3);
                    aj3Var3.invoke(vj8.f65508a, tj3Var3, 6);
                    tj3Var3.m22139q(true);
                } else {
                    tj3Var3.m22102U();
                }
                return xfa.f68157a;
            case 6:
                ye1 ye1Var4 = (ye1) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                tj3 tj3Var4 = (tj3) ye1Var4;
                if (tj3Var4.m22099R(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    throw null;
                }
                tj3Var4.m22102U();
                return xfa.f68157a;
            case 7:
                ((Integer) obj2).getClass();
                ((C0061c) this.f47362b).m752a((ye1) obj, pk9.m19383z(1));
                return xfa.f68157a;
            case 8:
                ((Integer) obj2).getClass();
                AbstractC3584sr.m21618c((e16) this.f47362b, (ye1) obj, pk9.m19383z(1));
                return xfa.f68157a;
            case 9:
                LibraryUpdateFragment libraryUpdateFragment = (LibraryUpdateFragment) this.f47362b;
                ye1 ye1Var5 = (ye1) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                tj3 tj3Var5 = (tj3) ye1Var5;
                if (tj3Var5.m22099R(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    C2146e c2146eM9054i0 = libraryUpdateFragment.m9054i0();
                    boolean zM22124i = tj3Var5.m22124i(libraryUpdateFragment);
                    Object objM22097O = tj3Var5.m22097O();
                    if (zM22124i || objM22097O == we1.f66679a) {
                        objM22097O = new kv4(libraryUpdateFragment, i);
                        tj3Var5.m22131l0(objM22097O);
                    }
                    AbstractC2143d.m9058b(c2146eM9054i0, (vi3) objM22097O, tj3Var5, 0);
                } else {
                    tj3Var5.m22102U();
                }
                return xfa.f68157a;
            case 10:
                b85 b85Var = (b85) this.f47362b;
                ye1 ye1Var6 = (ye1) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                tj3 tj3Var6 = (tj3) ye1Var6;
                if (tj3Var6.m22099R(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    boolean zM22124i2 = tj3Var6.m22124i(b85Var);
                    Object objM22097O2 = tj3Var6.m22097O();
                    if (zM22124i2 || objM22097O2 == we1.f66679a) {
                        objM22097O2 = new ma5(b85Var, i2);
                        tj3Var6.m22131l0(objM22097O2);
                    }
                    AbstractC0257p.m1190e((ui3) objM22097O2, null, false, null, 0L, 0L, null, tj3Var6, 54);
                } else {
                    tj3Var6.m22102U();
                }
                return xfa.f68157a;
            case 11:
                String str = (String) this.f47362b;
                ye1 ye1Var7 = (ye1) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                tj3 tj3Var7 = (tj3) ye1Var7;
                if (tj3Var7.m22099R(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    vx9 vx9Var = ((ms5) tj3Var7.m22128k(ps5.f56764b)).f51800b.f71403g;
                    b16 b16Var4 = b16.f7762a;
                    boolean zM22120g = tj3Var7.m22120g(str);
                    Object objM22097O3 = tj3Var7.m22097O();
                    if (zM22120g || objM22097O3 == we1.f66679a) {
                        objM22097O3 = new ql4(str, i);
                        tj3Var7.m22131l0(objM22097O3);
                    }
                    lw9.m16554b("🏆", nv8.m17643c(b16Var4, false, (vi3) objM22097O3), 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, vx9Var, tj3Var7, 6, 0, 131068);
                } else {
                    tj3Var7.m22102U();
                }
                return xfa.f68157a;
            case 12:
                ((xt9) this.f47362b).mo17648e(((gq6) obj2).f41189a);
                return xfa.f68157a;
            case 13:
                OnboardingLoginFragment onboardingLoginFragment = (OnboardingLoginFragment) this.f47362b;
                ye1 ye1Var8 = (ye1) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                p84 p84Var = we1.f66679a;
                tj3 tj3Var8 = (tj3) ye1Var8;
                if (tj3Var8.m22099R(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    boolean zM22124i3 = tj3Var8.m22124i(onboardingLoginFragment);
                    Object objM22097O4 = tj3Var8.m22097O();
                    if (zM22124i3 || objM22097O4 == p84Var) {
                        objM22097O4 = new zt6(onboardingLoginFragment, i5);
                        tj3Var8.m22131l0(objM22097O4);
                    }
                    ui3 ui3Var4 = (ui3) objM22097O4;
                    boolean zM22124i4 = tj3Var8.m22124i(onboardingLoginFragment);
                    Object objM22097O5 = tj3Var8.m22097O();
                    if (zM22124i4 || objM22097O5 == p84Var) {
                        objM22097O5 = new zt6(onboardingLoginFragment, i4);
                        tj3Var8.m22131l0(objM22097O5);
                    }
                    ui3 ui3Var5 = (ui3) objM22097O5;
                    boolean zM22124i5 = tj3Var8.m22124i(onboardingLoginFragment);
                    Object objM22097O6 = tj3Var8.m22097O();
                    if (zM22124i5 || objM22097O6 == p84Var) {
                        objM22097O6 = new kv4(onboardingLoginFragment, i2);
                        tj3Var8.m22131l0(objM22097O6);
                    }
                    AbstractC3423or.m18248d(null, ui3Var4, ui3Var5, (vi3) objM22097O6, tj3Var8, 0);
                } else {
                    tj3Var8.m22102U();
                }
                return xfa.f68157a;
            case 14:
                C2177b c2177b = (C2177b) this.f47362b;
                String str2 = (String) obj;
                String str3 = (String) obj2;
                str2.getClass();
                str3.getClass();
                C2177b.m9112V2(c2177b, str2, str3, null, LoginAuthType.EMAIL, 4);
                return xfa.f68157a;
            case 15:
                t66 t66Var = (t66) this.f47362b;
                ye1 ye1Var9 = (ye1) obj;
                int iIntValue9 = ((Integer) obj2).intValue();
                tj3 tj3Var9 = (tj3) ye1Var9;
                if (tj3Var9.m22099R(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    p04 p04VarM3600c = ((Boolean) t66Var.getValue()).booleanValue() ? bbd.m3600c() : hka.m13318a();
                    String str4 = ((Boolean) t66Var.getValue()).booleanValue() ? "Hide password" : "Show password";
                    Object objM22097O7 = tj3Var9.m22097O();
                    if (objM22097O7 == we1.f66679a) {
                        objM22097O7 = new kb0(i3, t66Var);
                        tj3Var9.m22131l0(objM22097O7);
                    }
                    omd.m18141c((ui3) objM22097O7, null, false, null, null, ci8.m4703P(2131607047, new C3794yf(15, p04VarM3600c, str4), tj3Var9), tj3Var9, 1572870, 62);
                } else {
                    tj3Var9.m22102U();
                }
                return xfa.f68157a;
            case 16:
                OnboardingStartFragment onboardingStartFragment = (OnboardingStartFragment) this.f47362b;
                ye1 ye1Var10 = (ye1) obj;
                int iIntValue10 = ((Integer) obj2).intValue();
                p84 p84Var2 = we1.f66679a;
                tj3 tj3Var10 = (tj3) ye1Var10;
                if (tj3Var10.m22099R(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    ob1 ob1Var = onboardingStartFragment.f26983D0;
                    if (ob1Var == null) {
                        fa4.m11636J("commonUtils");
                        throw null;
                    }
                    String strM17892f = ob1Var.m17892f("google_client_id");
                    boolean zM22124i6 = tj3Var10.m22124i(onboardingStartFragment);
                    Object objM22097O8 = tj3Var10.m22097O();
                    if (zM22124i6 || objM22097O8 == p84Var2) {
                        objM22097O8 = new C3757xf(onboardingStartFragment, 27);
                        tj3Var10.m22131l0(objM22097O8);
                    }
                    ui3 ui3Var6 = (ui3) objM22097O8;
                    boolean zM22124i7 = tj3Var10.m22124i(onboardingStartFragment);
                    Object objM22097O9 = tj3Var10.m22097O();
                    if (zM22124i7 || objM22097O9 == p84Var2) {
                        objM22097O9 = new kv4(onboardingStartFragment, i3);
                        tj3Var10.m22131l0(objM22097O9);
                    }
                    AbstractC2215c.m9159c(null, strM17892f, ui3Var6, (vi3) objM22097O9, tj3Var10, 0);
                } else {
                    tj3Var10.m22102U();
                }
                return xfa.f68157a;
            case 17:
                C0281i c0281i = (C0281i) this.f47362b;
                Set set = (Set) obj;
                synchronized (c0281i.f3757d) {
                    try {
                        if (((Recomposer$State) c0281i.f3776w.getValue()).compareTo(Recomposer$State.Idle) >= 0) {
                            o66 o66Var3 = c0281i.f3762i;
                            if (set instanceof C0275a) {
                                AbstractC0042e abstractC0042e = ((C0275a) set).f3738a;
                                Object[] objArr = abstractC0042e.f1303b;
                                long[] jArr = abstractC0042e.f1302a;
                                int length = jArr.length - 2;
                                if (length >= 0) {
                                    int i6 = 0;
                                    while (true) {
                                        long j2 = jArr[i6];
                                        if ((((~j2) << 7) & j2 & j) != j) {
                                            int i7 = 8 - ((~(i6 - length)) >>> 31);
                                            for (int i8 = 0; i8 < i7; i8++) {
                                                if ((j2 & 255) < 128) {
                                                    Object obj3 = objArr[(i6 << 3) + i8];
                                                    if (!(obj3 instanceof qh9) || ((qh9) obj3).m19973c(1)) {
                                                        o66Var3.m17811d(obj3);
                                                    }
                                                }
                                                j2 >>= 8;
                                            }
                                            if (i7 == 8) {
                                                if (i6 != length) {
                                                    i6++;
                                                    j = -9187201950435737472L;
                                                }
                                            }
                                        } else if (i6 != length) {
                                            i6++;
                                            j = -9187201950435737472L;
                                        }
                                    }
                                }
                            } else {
                                for (Object obj4 : set) {
                                    if (!(obj4 instanceof qh9) || ((qh9) obj4).m19973c(1)) {
                                        o66Var3.m17811d(obj4);
                                    }
                                }
                            }
                            qm0VarM1284y = c0281i.m1284y();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                if (qm0VarM1284y != null) {
                    ((sm0) qm0VarM1284y).resumeWith(xfa.f68157a);
                }
                return xfa.f68157a;
            case 18:
                SafeCollector safeCollector = (SafeCollector) this.f47362b;
                int iIntValue11 = ((Integer) obj).intValue();
                in1 in1Var = (in1) obj2;
                jn1 key = in1Var.getKey();
                in1 in1Var2 = safeCollector.f48125b.get(key);
                if (key == nj0.f52795N) {
                    cd4 cd4Var = (cd4) in1Var2;
                    cd4 parent = (cd4) in1Var;
                    while (true) {
                        if (parent == null) {
                            parent = null;
                        } else if (parent != cd4Var && (parent instanceof cn8)) {
                            q01 q01VarM15499P = ((cn8) parent).m15499P();
                            parent = q01VarM15499P != null ? q01VarM15499P.getParent() : null;
                        }
                    }
                    if (parent != cd4Var) {
                        throw new IllegalStateException(("Flow invariant is violated:\n\t\tEmission from another coroutine is detected.\n\t\tChild of " + parent + ", expected child of " + cd4Var + ".\n\t\tFlowCollector is not thread-safe and concurrent emissions are prohibited.\n\t\tTo mitigate this restriction please use 'channelFlow' builder instead of 'flow'").toString());
                    }
                    if (cd4Var != null) {
                        iIntValue11++;
                    }
                } else if (in1Var != in1Var2) {
                    iIntValue11 = Integer.MIN_VALUE;
                } else {
                    iIntValue11++;
                }
                return Integer.valueOf(iIntValue11);
            case 19:
                r89 r89Var = (r89) this.f47362b;
                Set set2 = (Set) obj;
                synchronized (r89Var.f60774a) {
                    try {
                        o66 o66Var4 = r89Var.f58895d;
                        if (o66Var4 != null) {
                            Object[] objArr2 = o66Var4.f1303b;
                            long[] jArr2 = o66Var4.f1302a;
                            int length2 = jArr2.length - 2;
                            if (length2 >= 0) {
                                int i9 = 0;
                                while (true) {
                                    long j3 = jArr2[i9];
                                    if ((((~j3) << c2) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i10 = 8 - ((~(i9 - length2)) >>> 31);
                                        int i11 = 0;
                                        while (true) {
                                            if (i11 < i10) {
                                                if ((j3 & 255) < 128 && set2.contains(objArr2[(i9 << 3) + i11])) {
                                                    yv8Var = r89Var.f58897f;
                                                }
                                                j3 >>= 8;
                                                i11++;
                                                c2 = c2;
                                            } else {
                                                c = c2;
                                                if (i10 == 8) {
                                                }
                                                yv8Var = null;
                                            }
                                        }
                                    } else {
                                        c = c2;
                                    }
                                    if (i9 != length2) {
                                        i9++;
                                        c2 = c;
                                    } else {
                                        yv8Var = null;
                                    }
                                }
                            } else {
                                yv8Var = null;
                            }
                        } else if (u91.m22633z0(set2, r89Var.f58893b)) {
                            yv8Var = r89Var.f58897f;
                        } else {
                            yv8Var = null;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                if (yv8Var != null) {
                    yv8Var.mo4677k(xfa.f68157a);
                }
                return xfa.f68157a;
            case 20:
                C0282a c0282a = xwc.f68912b;
                sb9 sb9Var = (sb9) this.f47362b;
                ye1 ye1Var11 = (ye1) obj;
                int iIntValue12 = ((Integer) obj2).intValue();
                tj3 tj3Var11 = (tj3) ye1Var11;
                if (tj3Var11.m22099R(iIntValue12 & 1, (iIntValue12 & 3) != 2)) {
                    sb9Var.getClass();
                    c0282a.invoke(sb9Var, tj3Var11, 0);
                } else {
                    tj3Var11.m22102U();
                }
                return xfa.f68157a;
            case 21:
                ed9 ed9Var = (ed9) this.f47362b;
                Collection collection = (Set) obj;
                AtomicReference atomicReference = ed9Var.f37071b;
                while (true) {
                    Object obj5 = atomicReference.get();
                    if (obj5 == null) {
                        collectionM22603U0 = collection;
                    } else if (obj5 instanceof Set) {
                        collectionM22603U0 = vz1.m23605K(obj5, collection);
                    } else {
                        if (!(obj5 instanceof List)) {
                            cf1.m4606b("Unexpected notification");
                            C3386nv.m17631r();
                            return null;
                        }
                        collectionM22603U0 = u91.m22603U0(vz1.m23604J(collection), (Collection) obj5);
                    }
                    do {
                        if (atomicReference.compareAndSet(obj5, collectionM22603U0)) {
                            if (ed9Var.m11066b()) {
                                ed9Var.f37070a.invoke(new y47(ed9Var, 13));
                            }
                            return xfa.f68157a;
                        }
                    } while (atomicReference.get() == obj5);
                }
                break;
            case 22:
                ((Integer) obj2).getClass();
                AbstractC0686a.m2488d((on3) this.f47362b, (ye1) obj, pk9.m19383z(1));
                return xfa.f68157a;
            case DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER /* 23 */:
                ((Integer) obj2).getClass();
                ((C0180h) this.f47362b).m1077a((ye1) obj, pk9.m19383z(1));
                return xfa.f68157a;
            case 24:
                ((vi3) this.f47362b).invoke(obj);
                return xfa.f68157a;
            case 25:
                return new f84(((long) ((ec0) this.f47362b).mo4499a(0, (int) (((n84) obj).f52482a >> 32), (LayoutDirection) obj2)) << 32);
            case 26:
                return new f84(((long) ((fc0) this.f47362b).m11762a(0, (int) (((n84) obj).f52482a & 4294967295L))) & 4294967295L);
            default:
                return new f84(((InterfaceC3571se) this.f47362b).mo10276a(0L, ((n84) obj).f52482a, (LayoutDirection) obj2));
        }
    }

    public /* synthetic */ C3186kj(Object obj, int i, int i2) {
        this.f47361a = i2;
        this.f47362b = obj;
    }
}
