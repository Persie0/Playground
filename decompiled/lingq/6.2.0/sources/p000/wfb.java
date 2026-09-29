package p000;

import android.content.res.Resources;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.foundation.C0077c;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.p002ui.platform.AbstractC0406r;
import androidx.compose.p002ui.platform.C0401m;
import androidx.compose.p002ui.text.style.ResolvedTextDirection;
import androidx.compose.runtime.internal.C0282a;
import androidx.lifecycle.runtime.R$id;
import com.facebook.FacebookException;
import com.facebook.appevents.AppEvent;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import kotlin.AbstractC3193b;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.sequences.AbstractC3204c;
import kotlin.text.Regex;
import kotlin.time.Instant;
import kotlinx.coroutines.AbstractC3208a;
import kotlinx.coroutines.C3209b;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.DispatchException;

/* JADX INFO: loaded from: classes.dex */
public abstract class wfb {

    /* JADX INFO: renamed from: a */
    public static final C0282a f66765a = new C0282a(-1539160583, false, new oh0(15));

    /* JADX INFO: renamed from: b */
    public static final C0282a f66766b = new C0282a(-1068051984, false, new oh0(16));

    /* JADX INFO: renamed from: c */
    public static final C0282a f66767c = new C0282a(1848490544, false, new oh0(17));

    /* JADX INFO: renamed from: d */
    public static final C0282a f66768d = new C0282a(1713907855, false, new oh0(18));

    /* JADX INFO: renamed from: e */
    public static final C0282a f66769e = new C0282a(-1366268419, false, new oh0(19));

    /* JADX INFO: renamed from: f */
    public static final oj0 f66770f = new oj0(1);

    /* JADX INFO: renamed from: g */
    public static final /* synthetic */ int f66771g = 0;

    /* JADX INFO: renamed from: h */
    public static final /* synthetic */ int f66772h = 0;

    /* JADX INFO: renamed from: i */
    public static final /* synthetic */ int f66773i = 0;

    /* JADX INFO: renamed from: j */
    public static final /* synthetic */ int f66774j = 0;

    /* JADX INFO: renamed from: k */
    public static C3185ki f66775k;

    /* JADX INFO: renamed from: l */
    public static C3459pg f66776l;

    /* JADX INFO: renamed from: m */
    public static an0 f66777m;

    /* JADX INFO: renamed from: n */
    public static final /* synthetic */ int f66778n = 0;

    /* JADX INFO: renamed from: o */
    public static final /* synthetic */ int f66779o = 0;

    /* JADX INFO: renamed from: p */
    public static final /* synthetic */ int f66780p = 0;

    /* JADX INFO: renamed from: q */
    public static final /* synthetic */ int f66781q = 0;

    /* JADX INFO: renamed from: r */
    public static final /* synthetic */ int f66782r = 0;

    /* JADX INFO: renamed from: A */
    public static Object m23899A(zi3 zi3Var) {
        return m23900B(EmptyCoroutineContext.f47685a, zi3Var);
    }

    /* JADX INFO: renamed from: B */
    public static final Object m23900B(kn1 kn1Var, zi3 zi3Var) throws Throwable {
        yt2 yt2VarM20221a;
        kn1 kn1VarM22004r;
        long jMo10652j0;
        jn1 jn1Var = jj5.f45612c;
        nn1 nn1Var = (nn1) kn1Var.get(jn1Var);
        EmptyCoroutineContext emptyCoroutineContext = EmptyCoroutineContext.f47685a;
        if (nn1Var == null) {
            yt2VarM20221a = qz9.m20221a();
            kn1VarM22004r = te1.m22004r(emptyCoroutineContext, kn1Var.plus(yt2VarM20221a), true);
            v72 v72Var = ph2.f56212a;
            if (kn1VarM22004r != v72Var && kn1VarM22004r.get(jn1Var) == null) {
                kn1VarM22004r = kn1VarM22004r.plus(v72Var);
            }
        } else {
            yt2VarM20221a = (yt2) qz9.f58430a.get();
            kn1VarM22004r = te1.m22004r(emptyCoroutineContext, kn1Var, true);
            v72 v72Var2 = ph2.f56212a;
            if (kn1VarM22004r != v72Var2 && kn1VarM22004r.get(jn1Var) == null) {
                kn1VarM22004r = kn1VarM22004r.plus(v72Var2);
            }
        }
        ud0 ud0Var = new ud0(kn1VarM22004r, Thread.currentThread(), yt2VarM20221a);
        CoroutineStart.DEFAULT.invoke(zi3Var, ud0Var, ud0Var);
        yt2 yt2Var = ud0Var.f63750g;
        if (yt2Var != null) {
            int i = yt2.f70438f;
            yt2Var.m25313i0(false);
        }
        while (true) {
            if (yt2Var != null) {
                try {
                    jMo10652j0 = yt2Var.mo10652j0();
                } catch (Throwable th) {
                    if (yt2Var != null) {
                        int i2 = yt2.f70438f;
                        yt2Var.m25311g0(false);
                    }
                    throw th;
                }
            } else {
                jMo10652j0 = Long.MAX_VALUE;
            }
            if (ud0Var.m15504W()) {
                break;
            }
            LockSupport.parkNanos(ud0Var, jMo10652j0);
            if (Thread.interrupted()) {
                ud0Var.m15518y(new InterruptedException());
            }
        }
        if (yt2Var != null) {
            int i3 = yt2.f70438f;
            yt2Var.m25311g0(false);
        }
        Object objM21629h0 = AbstractC3584sr.m21629h0(ud0Var.m15500Q());
        dc1 dc1Var = objM21629h0 instanceof dc1 ? (dc1) objM21629h0 : null;
        if (dc1Var == null) {
            return objM21629h0;
        }
        throw dc1Var.f35375a;
    }

    /* JADX INFO: renamed from: C */
    public static final e16 m23901C(e16 e16Var, do8 do8Var, Orientation orientation, C0077c c0077c, boolean z, boolean z2, x63 x63Var, v56 v56Var, g27 g27Var) {
        return AbstractC3184kh.m15211e(e16Var, orientation).mo3161g(new zn8(g27Var, x63Var, v56Var, do8Var, c0077c, orientation, z, z2, false));
    }

    /* JADX INFO: renamed from: D */
    public static final n17 m23902D(float f) {
        return new n17(2, f);
    }

    /* JADX INFO: renamed from: E */
    public static void m23903E(String str) {
        boolean zContains;
        str.getClass();
        if (str.length() == 0 || str.length() > 40) {
            throw new FacebookException(String.format(Locale.ROOT, "Identifier '%s' must be less than %d characters", Arrays.copyOf(new Object[]{str, 40}, 2)));
        }
        HashSet hashSet = AppEvent.f11379f;
        synchronized (hashSet) {
            zContains = hashSet.contains(str);
        }
        if (zContains) {
            return;
        }
        if (!new Regex("^[0-9a-zA-Z_]+[0-9a-zA-Z _-]*$").m15427f(str)) {
            throw new FacebookException(String.format("Skipping event named '%s' due to illegal name - must be under 40 chars and alphanumeric, _, - or space, and not start with a space or hyphen.", Arrays.copyOf(new Object[]{str}, 1)));
        }
        synchronized (hashSet) {
            hashSet.add(str);
        }
    }

    /* JADX INFO: renamed from: F */
    public static final e16 m23904F(e16 e16Var, e5b e5bVar) {
        return e16Var.mo3161g(new r64(e5bVar, AbstractC0406r.m1816b()));
    }

    /* JADX INFO: renamed from: G */
    public static final Object m23905G(zi3 zi3Var, kn1 kn1Var, Continuation continuation) throws Throwable {
        Object objM21629h0;
        kn1 context = continuation.getContext();
        kn1 kn1VarPlus = !((Boolean) kn1Var.fold(Boolean.FALSE, new ln1(0))).booleanValue() ? context.plus(kn1Var) : te1.m22004r(context, kn1Var, false);
        AbstractC3208a.m15439f(kn1VarPlus);
        if (kn1VarPlus == context) {
            cn8 cn8Var = new cn8(kn1VarPlus, continuation);
            objM21629h0 = pfa.m19112b(cn8Var, true, cn8Var, zi3Var);
        } else {
            jj5 jj5Var = jj5.f45612c;
            if (fa4.m11650l(kn1VarPlus.get(jj5Var), context.get(jj5Var))) {
                ofa ofaVar = new ofa(kn1VarPlus, continuation);
                kn1 kn1Var2 = ofaVar.f7705e;
                Object objM20372O = r46.m20372O(kn1Var2, null);
                try {
                    objM21629h0 = pfa.m19112b(ofaVar, true, ofaVar, zi3Var);
                    r46.m20367J(kn1Var2, objM20372O);
                } catch (Throwable th) {
                    r46.m20367J(kn1Var2, objM20372O);
                    throw th;
                }
            } else {
                C3209b c3209b = new C3209b(kn1VarPlus, continuation);
                try {
                    eh0.m11116M(xfa.f68157a, AbstractC3584sr.m21600K(AbstractC3584sr.m21647z(zi3Var, c3209b, c3209b)));
                    AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = C3209b.f47763g;
                    do {
                        int i = atomicIntegerFieldUpdater.get(c3209b);
                        if (i != 0) {
                            if (i != 2) {
                                C3386nv.m17633t("Already suspended");
                                return null;
                            }
                            objM21629h0 = AbstractC3584sr.m21629h0(c3209b.m15500Q());
                            if (objM21629h0 instanceof dc1) {
                                throw ((dc1) objM21629h0).f35375a;
                            }
                        }
                    } while (!atomicIntegerFieldUpdater.compareAndSet(c3209b, 0, 1));
                    objM21629h0 = CoroutineSingletons.COROUTINE_SUSPENDED;
                } catch (Throwable th2) {
                    th = th2;
                    if (th instanceof DispatchException) {
                        th = ((DispatchException) th).f47748a;
                    }
                    c3209b.resumeWith(AbstractC3193b.m15358a(th));
                    throw th;
                }
            }
        }
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        return objM21629h0;
    }

    /* JADX INFO: renamed from: a */
    public static final e28 m23906a(long j, long j2) {
        return new e28(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)), Float.intBitsToFloat((int) (j2 >> 32)), Float.intBitsToFloat((int) (j2 & 4294967295L)));
    }

    /* JADX INFO: renamed from: b */
    public static final e28 m23907b(long j, long j2) {
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        return new e28(Float.intBitsToFloat(i), Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (j2 >> 32)) + Float.intBitsToFloat(i), Float.intBitsToFloat((int) (j2 & 4294967295L)) + Float.intBitsToFloat(i2));
    }

    /* JADX INFO: renamed from: c */
    public static final float m23908c(List list, Resources resources) {
        Iterator it = list.iterator();
        float dimension = 0.0f;
        while (it.hasNext()) {
            dimension += resources.getDimension(((Number) it.next()).intValue()) / resources.getDisplayMetrics().density;
        }
        return dimension;
    }

    /* JADX INFO: renamed from: d */
    public static final List m23909d(gz8 gz8Var, int i, int i2, ArrayList arrayList, s56 s56Var, int i3, int i4, int i5, boolean z, vi3 vi3Var) {
        int i6;
        s56 s56Var2;
        int i7;
        Object obj;
        int i8;
        if (gz8Var == null || arrayList.isEmpty() || (i6 = s56Var.f60382b) == 0) {
            return EmptyList.f47638a;
        }
        int i9 = -1;
        int i10 = 0;
        if (i2 - i < 0 || i6 == 0) {
            s56Var2 = b84.f8108a;
        } else {
            i84 i84VarM15922M = l70.m15922M(0, i6);
            int i11 = i84VarM15922M.f40379a;
            int i12 = i84VarM15922M.f40380b;
            int iM21103c = -1;
            if (i11 <= i12) {
                while (s56Var.m21103c(i11) <= i) {
                    iM21103c = s56Var.m21103c(i11);
                    if (i11 == i12) {
                        break;
                    }
                    i11++;
                }
            }
            if (iM21103c == -1) {
                s56Var2 = b84.f8108a;
            } else {
                s56 s56Var3 = b84.f8108a;
                s56Var2 = new s56(1);
                s56Var2.m21101a(iM21103c);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        int i13 = 0;
        while (i13 < size) {
            Object obj2 = arrayList.get(i13);
            int index = ((du4) obj2).getIndex();
            int[] iArr = s56Var.f60381a;
            int i14 = s56Var.f60382b;
            for (int i15 = i10; i15 < i14; i15++) {
                if (iArr[i15] == index) {
                    arrayList3.add(obj2);
                    break;
                }
            }
            i13++;
            i10 = 0;
        }
        int[] iArr2 = s56Var2.f60381a;
        int i16 = s56Var2.f60382b;
        int i17 = 0;
        while (i17 < i16) {
            int i18 = iArr2[i17];
            Iterator it = arrayList.iterator();
            int i19 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i19 = i9;
                    break;
                }
                if (((du4) it.next()).getIndex() == i18) {
                    break;
                }
                i19++;
            }
            du4 du4Var = i19 == i9 ? (du4) vi3Var.invoke(Integer.valueOf(i18)) : (du4) arrayList.remove(i19);
            int iM3208C = b34.m3208C(du4Var, z);
            if (i19 == i9) {
                i17 = i17;
                i7 = Integer.MIN_VALUE;
            } else {
                long jMo10673g = du4Var.mo10673g(0);
                i7 = (int) (z ? jMo10673g & 4294967295L : jMo10673g >> 32);
            }
            int size2 = arrayList3.size();
            int i20 = 0;
            while (true) {
                if (i20 >= size2) {
                    obj = null;
                    break;
                }
                obj = arrayList3.get(i20);
                if (((du4) obj).getIndex() != i18) {
                    break;
                }
                i20++;
            }
            du4 du4Var2 = (du4) obj;
            if (du4Var2 != null) {
                long jMo10673g2 = du4Var2.mo10673g(0);
                i8 = (int) (z ? jMo10673g2 & 4294967295L : jMo10673g2 >> 32);
            } else {
                i8 = Integer.MIN_VALUE;
            }
            int iMax = i7 == Integer.MIN_VALUE ? -i3 : Math.max(-i3, i7);
            if (i8 != Integer.MIN_VALUE) {
                iMax = Math.min(iMax, i8 - iM3208C);
            }
            du4Var.mo10676j();
            du4Var.mo10677k(iMax, 0, i4, i5);
            arrayList2.add(du4Var);
            i17++;
            i9 = -1;
        }
        return arrayList2;
    }

    /* JADX INFO: renamed from: e */
    public static y92 m23910e(un1 un1Var, kn1 kn1Var, zi3 zi3Var, int i) {
        if ((i & 1) != 0) {
            kn1Var = EmptyCoroutineContext.f47685a;
        }
        CoroutineStart coroutineStart = CoroutineStart.DEFAULT;
        kn1 kn1VarM21970C = te1.m21970C(un1Var, kn1Var);
        y92 fs4Var = coroutineStart.isLazy() ? new fs4(kn1VarM21970C, zi3Var) : new y92(kn1VarM21970C, true);
        coroutineStart.invoke(zi3Var, fs4Var, fs4Var);
        return fs4Var;
    }

    /* JADX INFO: renamed from: f */
    public static final Object m23911f(tld tldVar, Continuation continuation) throws Exception {
        if (!tldVar.mo5970l()) {
            sm0 sm0Var = new sm0(1, AbstractC3584sr.m21600K(continuation));
            sm0Var.m21468u();
            tldVar.mo5960b(qg2.f57746b, new nr9(sm0Var));
            Object objM21466r = sm0Var.m21466r();
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            return objM21466r;
        }
        Exception excMo5966h = tldVar.mo5966h();
        if (excMo5966h != null) {
            throw excMo5966h;
        }
        if (!tldVar.f62493d) {
            return tldVar.mo5967i();
        }
        throw new CancellationException("Task " + tldVar + " was cancelled normally.");
    }

    /* JADX INFO: renamed from: g */
    public static final int m23912g(long[] jArr, long j) {
        int length = jArr.length - 1;
        int i = 0;
        while (i <= length) {
            int i2 = (i + length) >>> 1;
            long j2 = jArr[i2];
            if (j > j2) {
                i = i2 + 1;
            } else {
                if (j >= j2) {
                    return i2;
                }
                length = i2 - 1;
            }
        }
        return -(i + 1);
    }

    /* JADX INFO: renamed from: h */
    public static void m23913h(Object obj, String str) {
        if (obj != null) {
            return;
        }
        C3386nv.m17635v(str);
    }

    /* JADX INFO: renamed from: i */
    public static final e16 m23914i(e16 e16Var, t17 t17Var) {
        return e16Var.mo3161g(new u17(t17Var, AbstractC0406r.m1816b()));
    }

    /* JADX INFO: renamed from: j */
    public static final e16 m23915j(e16 e16Var, p59 p59Var) {
        return e16Var.mo3161g(new vfa(p59Var, AbstractC0406r.m1816b()));
    }

    /* JADX INFO: renamed from: k */
    public static final int m23916k(View view, int i) {
        int i2 = 0;
        int i3 = Integer.MAX_VALUE;
        Object obj = null;
        while (view != null) {
            Object tag = view.getTag(i);
            if (tag != null) {
                if (obj != null) {
                    if (!tag.equals(obj)) {
                        break;
                    }
                } else {
                    obj = tag;
                }
                i3 = i2;
            }
            i2++;
            Object objM17996b = oha.m17996b(view);
            view = objM17996b instanceof View ? (View) objM17996b : null;
        }
        return i3;
    }

    /* JADX INFO: renamed from: l */
    public static r86 m23917l(u86 u86Var) {
        Iterator it = AbstractC3204c.m15418n0(u86Var, new lz5(11)).iterator();
        if (!it.hasNext()) {
            uk9.m22775i("Sequence is empty.");
            return null;
        }
        Object next = it.next();
        while (it.hasNext()) {
            next = it.next();
        }
        return (r86) next;
    }

    /* JADX INFO: renamed from: m */
    public static final View m23918m(View view) {
        if (!view.isAttachedToWindow()) {
            return view;
        }
        int iMin = Math.min(m23916k(view, R$id.view_tree_lifecycle_owner), m23916k(view, androidx.savedstate.R$id.view_tree_saved_state_registry_owner));
        View view2 = view;
        int i = 0;
        View view3 = view2;
        while (view != null) {
            if (i == iMin) {
                if (!(view.getParent() instanceof ViewGroup)) {
                    return view2;
                }
            } else if (m23921p(view) == null) {
                i++;
                Object objM17996b = oha.m17996b(view);
                View view4 = view2;
                view2 = view;
                view = objM17996b instanceof View ? (View) objM17996b : null;
                view3 = view4;
            }
            return view;
        }
        return view3;
    }

    /* JADX INFO: renamed from: n */
    public static final e16 m23919n(e16 e16Var, boolean z, v56 v56Var) {
        return e16Var.mo3161g(z ? new na3(v56Var) : b16.f7762a);
    }

    /* JADX INFO: renamed from: o */
    public static Instant m23920o(long j, long j2) {
        long j3 = j2 / 1000000000;
        if ((j2 ^ 1000000000) < 0 && j3 * 1000000000 != j2) {
            j3--;
        }
        long j4 = j + j3;
        if ((j ^ j4) < 0 && (j3 ^ j) >= 0) {
            return j > 0 ? Instant.f47732d : Instant.f47731c;
        }
        if (j4 < -31557014167219200L) {
            return Instant.f47731c;
        }
        if (j4 > 31556889864403199L) {
            return Instant.f47732d;
        }
        long j5 = j2 % 1000000000;
        return new Instant((int) (j5 + ((((j5 ^ 1000000000) & ((-j5) | j5)) >> 63) & 1000000000)), j4);
    }

    /* JADX INFO: renamed from: p */
    public static final C0401m m23921p(View view) {
        Object tag = view.getTag(androidx.compose.p002ui.R$id.androidx_compose_ui_view_compose_view_context);
        WeakReference weakReference = tag instanceof WeakReference ? (WeakReference) tag : null;
        if (weakReference != null) {
            return (C0401m) weakReference.get();
        }
        return null;
    }

    /* JADX INFO: renamed from: q */
    public static final int m23922q(KeyEvent keyEvent) {
        return (chd.m4670d(keyEvent) ? 1 : 0) | (chd.m4671e(keyEvent) ? 2 : 0) | (chd.m4672f(keyEvent) ? 4 : 0) | (chd.m4673g(keyEvent) ? 8 : 0);
    }

    /* JADX INFO: renamed from: r */
    public static final ResolvedTextDirection m23923r(rw9 rw9Var, int i) {
        qw9 qw9Var = rw9Var.f59975a;
        w46 w46Var = rw9Var.f59976b;
        if (qw9Var.f58295a.f54604b.length() != 0) {
            int iM23743d = w46Var.m23743d(i);
            if ((i != 0 && iM23743d == w46Var.m23743d(i - 1)) || (i != qw9Var.f58295a.f54604b.length() && iM23743d == w46Var.m23743d(i + 1))) {
                return rw9Var.m20954a(i);
            }
        }
        return rw9Var.m20961h(i);
    }

    /* JADX INFO: renamed from: s */
    public static final void m23924s(tj3 tj3Var, zi3 zi3Var) {
        zi3Var.getClass();
        lda.m16119e(2, zi3Var);
        zi3Var.invoke(tj3Var, 1);
    }

    /* JADX INFO: renamed from: t */
    public static final pg9 m23925t(un1 un1Var, kn1 kn1Var, CoroutineStart coroutineStart, zi3 zi3Var) {
        kn1 kn1VarM21970C = te1.m21970C(un1Var, kn1Var);
        pg9 hw4Var = coroutineStart.isLazy() ? new hw4(kn1VarM21970C, zi3Var) : new pg9(kn1VarM21970C, true);
        coroutineStart.invoke(zi3Var, hw4Var, hw4Var);
        return hw4Var;
    }

    /* JADX INFO: renamed from: u */
    public static /* synthetic */ pg9 m23926u(un1 un1Var, kn1 kn1Var, CoroutineStart coroutineStart, zi3 zi3Var, int i) {
        if ((i & 1) != 0) {
            kn1Var = EmptyCoroutineContext.f47685a;
        }
        if ((i & 2) != 0) {
            coroutineStart = CoroutineStart.DEFAULT;
        }
        return m23925t(un1Var, kn1Var, coroutineStart, zi3Var);
    }

    /* JADX INFO: renamed from: v */
    public static final e16 m23927v(e16 e16Var, vi3 vi3Var) {
        return e16Var.mo3161g(new ik1(vi3Var, AbstractC0406r.m1816b()));
    }

    /* JADX INFO: renamed from: w */
    public static final on3 m23928w(on3 on3Var, float f) {
        n17 n17VarM23902D = m23902D(f);
        return on3Var.mo16935d(new r17(n17VarM23902D, n17VarM23902D, n17VarM23902D, n17VarM23902D));
    }

    /* JADX INFO: renamed from: x */
    public static on3 m23929x(on3 on3Var, float f, int i) {
        if ((i & 1) != 0) {
            f = 0.0f;
        }
        float f2 = (i & 2) == 0 ? 4.0f : 0.0f;
        return on3Var.mo16935d(new r17(m23902D(f), m23902D(f2), m23902D(f), m23902D(f2)));
    }

    /* JADX INFO: renamed from: y */
    public static final on3 m23930y(on3 on3Var, float f, float f2, float f3, float f4) {
        return on3Var.mo16935d(new r17(m23902D(f), m23902D(f2), m23902D(f3), m23902D(f4)));
    }

    /* JADX INFO: renamed from: z */
    public static on3 m23931z(on3 on3Var, float f, int i) {
        float f2 = (i & 1) != 0 ? 0.0f : 2.0f;
        if ((i & 2) != 0) {
            f = 0.0f;
        }
        return m23930y(on3Var, f2, f, 0.0f, (i & 8) != 0 ? 0.0f : 12.0f);
    }
}
