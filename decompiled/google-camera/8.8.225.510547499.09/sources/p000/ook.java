package p000;

import com.google.android.apps.camera.bottombar.C0100R;
import com.google.p020vr.vrcore.controller.api.DJK.rmwTRjObXLGH;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ook {
    /* JADX INFO: renamed from: A */
    public static /* synthetic */ String m18763A(String str, String str2, String str3) {
        int i = 0;
        int iM18806t = m18806t(str, str2, 0);
        if (iM18806t < 0) {
            return str;
        }
        int length = str2.length();
        int length2 = (str.length() - length) + str3.length();
        if (length2 < 0) {
            throw new OutOfMemoryError();
        }
        StringBuilder sb = new StringBuilder(length2);
        do {
            sb.append((CharSequence) str, i, iM18806t);
            sb.append(str3);
            i = iM18806t + length;
            if (iM18806t >= str.length()) {
                break;
            }
            iM18806t = m18806t(str, str2, iM18806t + m18789c(length, 1));
        } while (iM18806t > 0);
        sb.append((CharSequence) str, i, str.length());
        return sb.toString();
    }

    /* JADX INFO: renamed from: B */
    public static List m18764B(CharSequence charSequence, String[] strArr, int i) {
        charSequence.getClass();
        int length = 0;
        String str = strArr[0];
        if (str.length() == 0) {
            ope opeVar = new ope(m18811y(charSequence, strArr, i), 0);
            ArrayList arrayList = new ArrayList(omn.m18678R(opeVar));
            Iterator it = opeVar.iterator();
            while (it.hasNext()) {
                arrayList.add(m18803q(charSequence, (oot) it.next()));
            }
            return arrayList;
        }
        int iM18806t = m18806t(charSequence, str, 0);
        if (iM18806t != -1) {
            if (i != 1) {
                boolean z = i > 0;
                ArrayList arrayList2 = new ArrayList(z ? i : 10);
                do {
                    arrayList2.add(charSequence.subSequence(length, iM18806t).toString());
                    length = str.length() + iM18806t;
                    if (z && arrayList2.size() == i - 1) {
                        break;
                    }
                    iM18806t = m18806t(charSequence, str, length);
                } while (iM18806t != -1);
                arrayList2.add(charSequence.subSequence(length, charSequence.length()).toString());
                return arrayList2;
            }
        }
        return omn.m18666F(charSequence.toString());
    }

    /* JADX INFO: renamed from: D */
    public static /* synthetic */ boolean m18766D(String str, String str2) {
        str.getClass();
        str2.getClass();
        return str.startsWith(str2);
    }

    /* JADX INFO: renamed from: E */
    public static /* synthetic */ String m18767E(String str) {
        str.getClass();
        str.getClass();
        int iM18809w = m18809w(str, '.');
        if (iM18809w == -1) {
            return str;
        }
        String strSubstring = str.substring(iM18809w + 1, str.length());
        strSubstring.getClass();
        return strSubstring;
    }

    /* JADX INFO: renamed from: F */
    public static void m18768F(String str, String str2) {
        int iM18808v = m18808v(str, str2, 0, 6);
        if (iM18808v == -1) {
            return;
        }
        str.substring(iM18808v + str2.length(), str.length()).getClass();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: G */
    public static final Object m18769G(Object obj, ols olsVar) {
        olsVar.getClass();
        if (!(obj instanceof oqg)) {
            return obj;
        }
        Throwable thM19156a = ((oqg) obj).f46421b;
        if (oqu.f46433b) {
            thM19156a = oxy.m19156a(thM19156a, olsVar);
        }
        return lkm.m15591r(thM19156a);
    }

    /* JADX INFO: renamed from: H */
    public static final Object m18770H(Object obj) {
        Throwable thM18589a = okd.m18589a(obj);
        return thM18589a == null ? obj : new oqg(thM18589a);
    }

    /* JADX INFO: renamed from: I */
    public static final opy m18771I(ols olsVar) {
        opy opyVar;
        if (!(olsVar instanceof oxf)) {
            return new opy(olsVar, 1);
        }
        oxf oxfVar = (oxf) olsVar;
        opn opnVar = oxfVar.f46769e;
        while (true) {
            Object obj = opnVar.f46397a;
            if (obj == null) {
                oxfVar.f46769e.m18855c(oxg.f46771b);
                opyVar = null;
                break;
            }
            if (obj instanceof opy) {
                if (oxfVar.f46769e.m18856d(obj, oxg.f46771b)) {
                    opyVar = (opy) obj;
                    break;
                }
            } else if (obj != oxg.f46771b && !(obj instanceof Throwable)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Inconsistent state ");
                sb.append(obj);
                throw new IllegalStateException("Inconsistent state ".concat(obj.toString()));
            }
        }
        if (opyVar == null) {
            return new opy(olsVar, 2);
        }
        boolean z = oqu.f46432a;
        Object obj2 = opyVar.f46409d.f46397a;
        if (obj2 instanceof oqf) {
            Object obj3 = ((oqf) obj2).f46419d;
        }
        opyVar.f46408c.f46391b = 0;
        opyVar.f46409d.m18855c(opq.f46401a);
        return opyVar;
    }

    /* JADX INFO: renamed from: J */
    public static final void m18772J(opx opxVar, orf orfVar) {
        opxVar.mo18870a(new org(orfVar));
    }

    /* JADX INFO: renamed from: L */
    public static final Object m18774L(oly olyVar, onm onmVar, ols olsVar) throws Throwable {
        Object objM19017b;
        oly olyVarMo18639d = olsVar.mo18639d();
        olyVarMo18639d.getClass();
        olyVar.getClass();
        oly olyVarPlus = !oqn.m18914d(olyVar) ? olyVarMo18639d.plus(olyVar) : oqn.m18911a(olyVarMo18639d, olyVar, false);
        ooc.m18755u(olyVarPlus);
        if (olyVarPlus == olyVarMo18639d) {
            oxw oxwVar = new oxw(olyVarPlus, olsVar);
            objM19017b = lku.m15635ad(oxwVar, oxwVar, onmVar);
        } else if (!ooc.m18737c(olyVarPlus.get(olu.f46271a), olyVarMo18639d.get(olu.f46271a))) {
            ora oraVar = new ora(olyVarPlus, olsVar);
            lku.m15636ae(onmVar, oraVar, oraVar);
            opl oplVar = oraVar.f46443b;
            while (true) {
                switch (oplVar.f46391b) {
                    case 0:
                        if (oraVar.f46443b.m18847c(0, 1)) {
                            objM19017b = oma.COROUTINE_SUSPENDED;
                        }
                        break;
                    case 1:
                    default:
                        throw new IllegalStateException("Already suspended");
                    case 2:
                        objM19017b = osh.m19017b(oraVar.m19010cV());
                        if (objM19017b instanceof oqg) {
                            throw ((oqg) objM19017b).f46421b;
                        }
                        break;
                }
            }
        } else {
            osx osxVar = new osx(olyVarPlus, olsVar);
            Object objM19165b = oyb.m19165b(olyVarPlus, null);
            try {
                Object objM15635ad = lku.m15635ad(osxVar, osxVar, onmVar);
                oyb.m19166c(olyVarPlus, objM19165b);
                objM19017b = objM15635ad;
            } catch (Throwable th) {
                oyb.m19166c(olyVarPlus, objM19165b);
                throw th;
            }
        }
        if (objM19017b == oma.COROUTINE_SUSPENDED) {
            olsVar.getClass();
        }
        return objM19017b;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x006c A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:29:0x006d  */
    /* JADX WARN: Code duplicated, block: B:31:0x0088  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: M */
    public static final Object m18775M(our ourVar, onm onmVar, ols olsVar) {
        ovj ovjVar;
        onm onmVar2;
        ooi ooiVar;
        owa e;
        mcz mczVar;
        Object obj;
        if (olsVar instanceof ovj) {
            ovjVar = (ovj) olsVar;
            int i = ovjVar.f46655b;
            if ((i & Integer.MIN_VALUE) != 0) {
                ovjVar.f46655b = i - Integer.MIN_VALUE;
            } else {
                ovjVar = new ovj(olsVar);
            }
        } else {
            ovjVar = new ovj(olsVar);
        }
        Object obj2 = ovjVar.f46654a;
        Object obj3 = oma.COROUTINE_SUSPENDED;
        switch (ovjVar.f46655b) {
            case 0:
                lkm.m15592s(obj2);
                ooi ooiVar2 = new ooi();
                ooiVar2.f46351a = owm.f46723a;
                mcz mczVar2 = new mcz(onmVar, ooiVar2, 3);
                try {
                    ovjVar.f46656c = onmVar;
                    ovjVar.f46657d = ooiVar2;
                    ovjVar.f46658e = mczVar2;
                    ovjVar.f46655b = 1;
                    if (ourVar.mo16104da(mczVar2, ovjVar) == obj3) {
                        return obj3;
                    }
                    onmVar2 = onmVar;
                    ooiVar = ooiVar2;
                    obj = ooiVar.f46351a;
                    if (obj != owm.f46723a) {
                        return obj;
                    }
                    StringBuilder sb = new StringBuilder();
                    sb.append("Expected at least one element matching the predicate ");
                    sb.append(onmVar2);
                    throw new NoSuchElementException("Expected at least one element matching the predicate ".concat(String.valueOf(onmVar2)));
                } catch (owa e2) {
                    onmVar2 = onmVar;
                    ooiVar = ooiVar2;
                    e = e2;
                    mczVar = mczVar2;
                    mczVar.getClass();
                    if (e.f46700a != mczVar) {
                        throw e;
                    }
                }
            case 1:
                mczVar = ovjVar.f46658e;
                ooiVar = ovjVar.f46657d;
                onmVar2 = ovjVar.f46656c;
                try {
                    lkm.m15592s(obj2);
                    break;
                } catch (owa e3) {
                    e = e3;
                    mczVar.getClass();
                    if (e.f46700a != mczVar) {
                        throw e;
                    }
                }
                obj = ooiVar.f46351a;
                if (obj != owm.f46723a) {
                    return obj;
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Expected at least one element matching the predicate ");
                sb2.append(onmVar2);
                throw new NoSuchElementException("Expected at least one element matching the predicate ".concat(String.valueOf(onmVar2)));
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: N */
    public static final Object m18776N(our ourVar, ous ousVar, ols olsVar) throws Throwable {
        ovf ovfVar;
        Throwable th;
        ooi ooiVar;
        ory oryVar;
        if (olsVar instanceof ovf) {
            ovfVar = (ovf) olsVar;
            int i = ovfVar.f46642b;
            if ((i & Integer.MIN_VALUE) != 0) {
                ovfVar.f46642b = i - Integer.MIN_VALUE;
            } else {
                ovfVar = new ovf(olsVar);
            }
        } else {
            ovfVar = new ovf(olsVar);
        }
        Object obj = ovfVar.f46641a;
        Object obj2 = oma.COROUTINE_SUSPENDED;
        switch (ovfVar.f46642b) {
            case 0:
                lkm.m15592s(obj);
                ooi ooiVar2 = new ooi();
                try {
                    ous mczVar = new mcz(ousVar, ooiVar2, 2);
                    ovfVar.f46643c = ooiVar2;
                    ovfVar.f46642b = 1;
                    if (ourVar.mo16104da(mczVar, ovfVar) == obj2) {
                        return obj2;
                    }
                    return null;
                } catch (Throwable th2) {
                    th = th2;
                    ooiVar = ooiVar2;
                }
                break;
            case 1:
                ooiVar = ovfVar.f46643c;
                try {
                    lkm.m15592s(obj);
                    return null;
                } catch (Throwable th3) {
                    th = th3;
                }
                break;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        Throwable th4 = (Throwable) ooiVar.f46351a;
        if (m18786X(th, th4) || ((oryVar = (ory) ovfVar.mo18639d().get(ory.f46473c)) != null && oryVar.mo18978t() && m18786X(th, oryVar.mo18975o()))) {
            throw th;
        }
        if (th4 == null) {
            return th;
        }
        if (th instanceof CancellationException) {
            lkm.m15595v(th4, th);
            throw th4;
        }
        lkm.m15595v(th, th4);
        throw th;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: O */
    public static final Object m18777O(ous ousVar, onn onnVar, Throwable th, ols olsVar) throws Throwable {
        ovb ovbVar;
        if (olsVar instanceof ovb) {
            ovbVar = (ovb) olsVar;
            int i = ovbVar.f46626b;
            if ((i & Integer.MIN_VALUE) != 0) {
                ovbVar.f46626b = i - Integer.MIN_VALUE;
            } else {
                ovbVar = new ovb(olsVar);
            }
        } else {
            ovbVar = new ovb(olsVar);
        }
        Object obj = ovbVar.f46625a;
        Object obj2 = oma.COROUTINE_SUSPENDED;
        switch (ovbVar.f46626b) {
            case 0:
                lkm.m15592s(obj);
                try {
                    ovbVar.f46627c = th;
                    ovbVar.f46626b = 1;
                    if (onnVar.mo16102a(ousVar, th, ovbVar) == obj2) {
                        return obj2;
                    }
                    return oki.f46196a;
                } catch (Throwable th2) {
                    th = th2;
                    if (th != null && th != th) {
                        lkm.m15595v(th, th);
                    }
                    throw th;
                }
            case 1:
                th = ovbVar.f46627c;
                try {
                    lkm.m15592s(obj);
                    return oki.f46196a;
                } catch (Throwable th3) {
                    th = th3;
                    if (th != null) {
                        lkm.m15595v(th, th);
                    }
                    throw th;
                }
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: renamed from: P */
    public static final our m18778P(our ourVar, onn onnVar) {
        return new ovd(ourVar, onnVar, 0);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: Q */
    public static final Object m18779Q(our ourVar, Collection collection, ols olsVar) {
        oux ouxVar;
        if (olsVar instanceof oux) {
            ouxVar = (oux) olsVar;
            int i = ouxVar.f46609b;
            if ((i & Integer.MIN_VALUE) != 0) {
                ouxVar.f46609b = i - Integer.MIN_VALUE;
            } else {
                ouxVar = new oux(olsVar);
            }
        } else {
            ouxVar = new oux(olsVar);
        }
        Object obj = ouxVar.f46608a;
        Object obj2 = oma.COROUTINE_SUSPENDED;
        switch (ouxVar.f46609b) {
            case 0:
                lkm.m15592s(obj);
                ous ouyVar = new ouy(collection, 0);
                ouxVar.f46610c = (ArrayList) collection;
                ouxVar.f46609b = 1;
                return ourVar.mo16104da(ouyVar, ouxVar) == obj2 ? obj2 : collection;
            case 1:
                ArrayList arrayList = ouxVar.f46610c;
                lkm.m15592s(obj);
                return arrayList;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: renamed from: R */
    public static final Object m18780R(ous ousVar, oud oudVar, ols olsVar) throws Throwable {
        Object objM18781S = m18781S(ousVar, oudVar, true, olsVar);
        return objM18781S == oma.COROUTINE_SUSPENDED ? objM18781S : oki.f46196a;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x005c A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:27:0x0061 A[Catch: all -> 0x00a5, TryCatch #1 {all -> 0x00a5, blocks: (B:25:0x005d, B:27:0x0061, B:29:0x0065, B:33:0x0076, B:34:0x0090, B:35:0x0091, B:37:0x0096, B:45:0x00a4), top: B:60:0x005d }] */
    /* JADX WARN: Code duplicated, block: B:29:0x0065 A[Catch: all -> 0x00a5, TryCatch #1 {all -> 0x00a5, blocks: (B:25:0x005d, B:27:0x0061, B:29:0x0065, B:33:0x0076, B:34:0x0090, B:35:0x0091, B:37:0x0096, B:45:0x00a4), top: B:60:0x005d }] */
    /* JADX WARN: Code duplicated, block: B:31:0x0074  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x0074 -> B:22:0x004d). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX INFO: renamed from: S */
    public static final java.lang.Object m18781S(p000.ous r4, p000.oud r5, boolean r6, p000.ols r7) throws java.lang.Throwable {
        /*
            boolean r0 = r7 instanceof p000.ouv
            if (r0 == 0) goto L13
            r0 = r7
            ouv r0 = (p000.ouv) r0
            int r1 = r0.f46603c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f46603c = r1
            goto L18
        L13:
            ouv r0 = new ouv
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f46602b
            oma r1 = p000.oma.COROUTINE_SUSPENDED
            int r2 = r0.f46603c
            switch(r2) {
                case 0: goto L43;
                case 1: goto L33;
                case 2: goto L29;
                default: goto L21;
            }
        L21:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L29:
            boolean r6 = r0.f46601a
            oud r5 = r0.f46605e
            ous r4 = r0.f46604d
            p000.lkm.m15592s(r7)     // Catch: java.lang.Throwable -> La7
            goto L4d
        L33:
            boolean r6 = r0.f46601a
            oud r5 = r0.f46605e
            ous r4 = r0.f46604d
            p000.lkm.m15592s(r7)     // Catch: java.lang.Throwable -> L41
            otu r7 = (p000.otu) r7     // Catch: java.lang.Throwable -> L41
            java.lang.Object r7 = r7.f46546b     // Catch: java.lang.Throwable -> L41
            goto L5d
        L41:
            r4 = move-exception
            goto La8
        L43:
            p000.lkm.m15592s(r7)
            r4.getClass()
            boolean r7 = r4 instanceof p000.ovz
            if (r7 != 0) goto Lb1
        L4d:
            r0.f46604d = r4     // Catch: java.lang.Throwable -> La7
            r0.f46605e = r5     // Catch: java.lang.Throwable -> La7
            r0.f46601a = r6     // Catch: java.lang.Throwable -> La7
            r7 = 1
            r0.f46603c = r7     // Catch: java.lang.Throwable -> La7
            java.lang.Object r7 = r5.mo19038c(r0)     // Catch: java.lang.Throwable -> La7
            if (r7 != r1) goto L5d
            return r1
        L5d:
            boolean r2 = r7 instanceof p000.ots     // Catch: java.lang.Throwable -> La5
            if (r2 != 0) goto L91
            boolean r2 = r7 instanceof p000.ott     // Catch: java.lang.Throwable -> La5
            if (r2 != 0) goto L76
            r0.f46604d = r4     // Catch: java.lang.Throwable -> La5
            r0.f46605e = r5     // Catch: java.lang.Throwable -> La5
            r0.f46601a = r6     // Catch: java.lang.Throwable -> La5
            r2 = 2
            r0.f46603c = r2     // Catch: java.lang.Throwable -> La5
            java.lang.Object r7 = r4.mo16103a(r7, r0)     // Catch: java.lang.Throwable -> La5
            if (r7 == r1) goto L75
            goto L4d
        L75:
            return r1
        L76:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> La5
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> La5
            r0.<init>()     // Catch: java.lang.Throwable -> La5
            java.lang.String r1 = "Trying to call 'getOrThrow' on a failed channel result: "
            r0.append(r1)     // Catch: java.lang.Throwable -> La5
            r0.append(r7)     // Catch: java.lang.Throwable -> La5
            java.lang.String r7 = java.lang.String.valueOf(r7)     // Catch: java.lang.Throwable -> La5
            java.lang.String r7 = r1.concat(r7)     // Catch: java.lang.Throwable -> La5
            r4.<init>(r7)     // Catch: java.lang.Throwable -> La5
            throw r4     // Catch: java.lang.Throwable -> La5
        L91:
            ots r7 = (p000.ots) r7     // Catch: java.lang.Throwable -> La5
            r4 = 0
            if (r7 == 0) goto L99
            java.lang.Throwable r7 = r7.f46544a     // Catch: java.lang.Throwable -> La5
            goto L9a
        L99:
            r7 = r4
        L9a:
            if (r7 != 0) goto La4
            if (r6 == 0) goto La1
            p000.ooc.m18749o(r5, r4)
        La1:
            oki r4 = p000.oki.f46196a
            return r4
        La4:
            throw r7     // Catch: java.lang.Throwable -> La5
        La5:
            r4 = move-exception
            goto La8
        La7:
            r4 = move-exception
        La8:
            throw r4     // Catch: java.lang.Throwable -> La9
        La9:
            r7 = move-exception
            if (r6 != 0) goto Lad
            goto Lb0
        Lad:
            p000.ooc.m18749o(r5, r4)
        Lb0:
            throw r7
        Lb1:
            ovz r4 = (p000.ovz) r4
            java.lang.Throwable r4 = r4.f46698a
            goto Lb7
        Lb6:
            throw r4
        Lb7:
            goto Lb6
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.ook.m18781S(ous, oud, boolean, ols):java.lang.Object");
    }

    /* JADX INFO: renamed from: T */
    public static final our m18782T(onm onmVar) {
        return new oum(onmVar, olz.f46282a);
    }

    /* JADX INFO: renamed from: U */
    public static final our m18783U(onm onmVar) {
        return new ouk(onmVar);
    }

    /* JADX INFO: renamed from: X */
    private static final boolean m18786X(Throwable th, Throwable th2) {
        if (th2 == null) {
            return false;
        }
        if (oqu.f46433b) {
            th2 = oxy.m19158c(th2);
        }
        if (oqu.f46433b) {
            th = oxy.m19158c(th);
        }
        return ooc.m18737c(th2, th);
    }

    /* JADX INFO: renamed from: a */
    public static boolean m18787a(Object obj, int i) {
        int iMo18660i;
        if (obj instanceof ojv) {
            if (obj instanceof ooa) {
                iMo18660i = ((ooa) obj).mo18660i();
            } else if (obj instanceof omx) {
                iMo18660i = 0;
            } else if (obj instanceof oni) {
                iMo18660i = 1;
            } else if (obj instanceof onm) {
                iMo18660i = 2;
            } else if (obj instanceof onn) {
                iMo18660i = 3;
            } else if (obj instanceof ono) {
                iMo18660i = 4;
            } else if (obj instanceof onp) {
                iMo18660i = 5;
            } else if (obj instanceof onq) {
                iMo18660i = 6;
            } else if (obj instanceof onr) {
                iMo18660i = 7;
            } else if (obj instanceof ons) {
                iMo18660i = 8;
            } else if (obj instanceof ont) {
                iMo18660i = 9;
            } else if (obj instanceof omy) {
                iMo18660i = 10;
            } else if (obj instanceof omz) {
                iMo18660i = 11;
            } else if (obj instanceof ona) {
                iMo18660i = 12;
            } else if (obj instanceof onb) {
                iMo18660i = 13;
            } else if (obj instanceof onc) {
                iMo18660i = 14;
            } else if (obj instanceof ond) {
                iMo18660i = 15;
            } else if (obj instanceof one) {
                iMo18660i = 16;
            } else if (obj instanceof onf) {
                iMo18660i = 17;
            } else if (obj instanceof ong) {
                iMo18660i = 18;
            } else if (obj instanceof onh) {
                iMo18660i = 19;
            } else if (obj instanceof onj) {
                iMo18660i = 20;
            } else if (obj instanceof onk) {
                iMo18660i = 21;
            } else {
                iMo18660i = obj instanceof onl ? 22 : -1;
            }
            if (iMo18660i == i) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: b */
    public static void m18788b(Object obj, int i) {
        if (m18787a(obj, i)) {
            return;
        }
        String name = obj.getClass().getName();
        ClassCastException classCastException = new ClassCastException(name + " cannot be cast to " + ("kotlin.jvm.functions.Function" + i));
        ooc.m18738d(classCastException, ook.class.getName());
        throw classCastException;
    }

    /* JADX INFO: renamed from: c */
    public static int m18789c(int i, int i2) {
        return i < i2 ? i2 : i;
    }

    /* JADX INFO: renamed from: d */
    public static int m18790d(int i, int i2) {
        return i > i2 ? i2 : i;
    }

    /* JADX INFO: renamed from: e */
    public static int m18791e(int i, int i2, int i3) {
        if (i2 <= i3) {
            if (i < i2) {
                return i2;
            }
            return i > i3 ? i3 : i;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + i3 + " is less than minimum " + i2 + '.');
    }

    /* JADX INFO: renamed from: f */
    public static long m18792f(long j, long j2) {
        return j > j2 ? j2 : j;
    }

    /* JADX INFO: renamed from: g */
    public static final opk m18793g(boolean z) {
        return new opk(z, opo.f46399a, null, null);
    }

    /* JADX INFO: renamed from: h */
    public static final opl m18794h(int i) {
        return new opl(i, opo.f46399a, null, null);
    }

    /* JADX INFO: renamed from: i */
    public static final opm m18795i(long j) {
        return new opm(j, opo.f46399a, null, null);
    }

    /* JADX INFO: renamed from: j */
    public static final opn m18796j(Object obj) {
        return new opn(obj, opo.f46399a, null, null);
    }

    /* JADX INFO: renamed from: k */
    public static final void m18797k(Appendable appendable, Object obj, oni oniVar) throws IOException {
        if (oniVar != null) {
            appendable.append((CharSequence) oniVar.mo1803a(obj));
            return;
        }
        if (obj == null || (obj instanceof CharSequence)) {
            appendable.append((CharSequence) obj);
        } else if (obj instanceof Character) {
            appendable.append(((Character) obj).charValue());
        } else {
            appendable.append(obj.toString());
        }
    }

    /* JADX INFO: renamed from: l */
    public static String m18798l(String str) throws IOException {
        Comparable comparable;
        int i = 0;
        List listM18744j = ooc.m18744j(new opg(m18811y(str, new String[]{"\r\n", "\n", "\r"}, 0), new avu(str, 9)));
        ArrayList<String> arrayList = new ArrayList();
        for (Object obj : listM18744j) {
            if (!m18800n((String) obj)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(omn.m18678R(arrayList));
        for (String str2 : arrayList) {
            int length = str2.length();
            int length2 = 0;
            while (true) {
                if (length2 >= length) {
                    length2 = -1;
                    break;
                }
                if (!ooc.m18740f(str2.charAt(length2))) {
                    break;
                }
                length2++;
            }
            if (length2 == -1) {
                length2 = str2.length();
            }
            arrayList2.add(Integer.valueOf(length2));
        }
        Iterator it = arrayList2.iterator();
        if (it.hasNext()) {
            comparable = (Comparable) it.next();
            while (it.hasNext()) {
                Comparable comparable2 = (Comparable) it.next();
                if (comparable.compareTo(comparable2) > 0) {
                    comparable = comparable2;
                }
            }
        } else {
            comparable = null;
        }
        Integer num = (Integer) comparable;
        int iIntValue = num != null ? num.intValue() : 0;
        int length3 = str.length();
        listM18744j.size();
        oni avuVar = "".length() == 0 ? axf.f2643g : new avu(8);
        int iM18667G = omn.m18667G(listM18744j);
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : listM18744j) {
            int i2 = i + 1;
            if (i < 0) {
                omn.m18670J();
            }
            String str3 = (String) obj2;
            if ((i == 0 || i == iM18667G) && m18800n(str3)) {
                str3 = null;
            } else {
                str3.getClass();
                if (iIntValue < 0) {
                    throw new IllegalArgumentException(rmwTRjObXLGH.itsVAN + iIntValue + " is less than zero.");
                }
                String strSubstring = str3.substring(m18790d(iIntValue, str3.length()));
                strSubstring.getClass();
                String str4 = (String) avuVar.mo1803a(strSubstring);
                if (str4 != null) {
                    str3 = str4;
                }
            }
            if (str3 != null) {
                arrayList3.add(str3);
            }
            i = i2;
        }
        StringBuilder sb = new StringBuilder(length3);
        omn.m18682V(arrayList3, sb, "\n", null, C0100R.styleable.AppCompatTheme_windowMinWidthMajor);
        return sb.toString();
    }

    /* JADX INFO: renamed from: m */
    public static Long m18799m(String str) {
        int i;
        str.getClass();
        int i2 = 10;
        ooc.m18741g(10);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        boolean z = false;
        char cCharAt = str.charAt(0);
        long j = -9223372036854775807L;
        if (ooc.m18735a(cCharAt, 48) < 0) {
            i = 1;
            if (length == 1) {
                return null;
            }
            if (cCharAt == '-') {
                j = Long.MIN_VALUE;
                z = true;
            } else if (cCharAt != '+') {
                return null;
            }
        } else {
            i = 0;
        }
        long j2 = 0;
        long j3 = -256204778801521550L;
        while (i < length) {
            int iDigit = Character.digit((int) str.charAt(i), i2);
            if (iDigit < 0) {
                return null;
            }
            if (j2 < j3) {
                if (j3 != -256204778801521550L) {
                    return null;
                }
                j3 = -922337203685477580L;
                if (j2 < -922337203685477580L) {
                    return null;
                }
            }
            long j4 = j2 * 10;
            int i3 = length;
            long j5 = iDigit;
            if (j4 < j + j5) {
                return null;
            }
            j2 = j4 - j5;
            i++;
            length = i3;
            i2 = 10;
        }
        return z ? Long.valueOf(j2) : Long.valueOf(-j2);
    }

    /* JADX INFO: renamed from: n */
    public static boolean m18800n(CharSequence charSequence) {
        charSequence.getClass();
        if (charSequence.length() == 0) {
            return true;
        }
        okz it = new oot(0, charSequence.length() - 1).iterator();
        while (it.f46220a) {
            if (!ooc.m18740f(charSequence.charAt(it.m18604a()))) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: o */
    public static int m18801o(CharSequence charSequence) {
        charSequence.getClass();
        return charSequence.length() - 1;
    }

    /* JADX INFO: renamed from: p */
    public static CharSequence m18802p(CharSequence charSequence) {
        int length = charSequence.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            boolean zM18740f = ooc.m18740f(charSequence.charAt(true != z ? i : length));
            if (z) {
                if (!zM18740f) {
                    break;
                }
                length--;
            } else if (zM18740f) {
                i++;
            } else {
                z = true;
            }
        }
        return charSequence.subSequence(i, length + 1);
    }

    /* JADX INFO: renamed from: q */
    public static String m18803q(CharSequence charSequence, oot ootVar) {
        ootVar.getClass();
        return charSequence.subSequence(Integer.valueOf(ootVar.f46357a).intValue(), Integer.valueOf(ootVar.f46358b).intValue() + 1).toString();
    }

    /* JADX INFO: renamed from: r */
    public static /* synthetic */ boolean m18804r(CharSequence charSequence, CharSequence charSequence2) {
        return m18808v(charSequence, (String) charSequence2, 0, 2) >= 0;
    }

    /* JADX INFO: renamed from: s */
    public static /* synthetic */ boolean m18805s(CharSequence charSequence, char c) {
        return charSequence.length() > 0 && ooc.m18742h(charSequence.charAt(m18801o(charSequence)), c);
    }

    /* JADX INFO: renamed from: t */
    public static int m18806t(CharSequence charSequence, String str, int i) {
        str.getClass();
        if (charSequence instanceof String) {
            return ((String) charSequence).indexOf(str, i);
        }
        oot ootVar = new oot(m18789c(i, 0), m18790d(charSequence.length(), charSequence.length()));
        int i2 = ootVar.f46357a;
        int i3 = ootVar.f46358b;
        if (i2 > i3) {
            return -1;
        }
        while (!m18812z(str, charSequence, i2, str.length())) {
            if (i2 == i3) {
                return -1;
            }
            i2++;
        }
        return i2;
    }

    /* JADX INFO: renamed from: u */
    public static /* synthetic */ int m18807u(CharSequence charSequence, char c, int i, int i2) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        return ((String) charSequence).indexOf(c, i);
    }

    /* JADX INFO: renamed from: v */
    public static /* synthetic */ int m18808v(CharSequence charSequence, String str, int i, int i2) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        return m18806t(charSequence, str, i);
    }

    /* JADX INFO: renamed from: w */
    public static /* synthetic */ int m18809w(CharSequence charSequence, char c) {
        return ((String) charSequence).lastIndexOf(c, m18801o(charSequence));
    }

    /* JADX INFO: renamed from: x */
    public static String m18810x(String str, int i) {
        CharSequence charSequenceSubSequence;
        if (i <= str.length()) {
            charSequenceSubSequence = str.subSequence(0, str.length());
        } else {
            StringBuilder sb = new StringBuilder(i);
            sb.append((CharSequence) str);
            okz it = new oot(1, i - str.length()).iterator();
            while (it.f46220a) {
                it.m18604a();
                sb.append(' ');
            }
            charSequenceSubSequence = sb;
        }
        return charSequenceSubSequence.toString();
    }

    /* JADX INFO: renamed from: y */
    static /* synthetic */ opa m18811y(CharSequence charSequence, String[] strArr, int i) {
        return new opj(charSequence, i, new owq(omn.m18683W(strArr), 1));
    }

    /* JADX INFO: renamed from: z */
    public static boolean m18812z(CharSequence charSequence, CharSequence charSequence2, int i, int i2) {
        charSequence.getClass();
        if (i < 0 || charSequence.length() - i2 < 0 || i > charSequence2.length() - i2) {
            return false;
        }
        for (int i3 = 0; i3 < i2; i3++) {
            if (!ooc.m18742h(charSequence.charAt(i3), charSequence2.charAt(i + i3))) {
                return false;
            }
        }
        return true;
    }
}
