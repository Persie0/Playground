package p000;

import android.view.View;
import androidx.compose.foundation.gestures.C0116v;
import androidx.compose.foundation.gestures.C0119y;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.text.C0180h;
import androidx.compose.p002ui.layout.AbstractC0343j;
import androidx.compose.runtime.C0281i;
import androidx.compose.runtime.Recomposer$State;
import androidx.datastore.preferences.protobuf.DescriptorProtos;
import com.lingq.core.domain.model.notification.Notice;
import com.lingq.core.playlists.C1833i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Pair;
import kotlin.jvm.internal.Ref$BooleanRef;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ui5 implements vi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f63960a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f63961b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f63962c;

    public /* synthetic */ ui5(int i, Object obj, Object obj2) {
        this.f63960a = i;
        this.f63961b = obj;
        this.f63962c = obj2;
    }

    /* JADX WARN: Code duplicated, block: B:80:0x01a8  */
    @Override // p000.vi3
    public final Object invoke(Object obj) throws Exception {
        rw9 rw9Var;
        C3500qj c3500qjM20962i;
        qw9 qw9Var;
        ww9 ww9VarMo10312b;
        ww9 ww9VarMo10312b2;
        ww9 ww9VarMo10312b3;
        int i = 3;
        Throwable th = null;
        he9VarM13212d = null;
        he9 he9VarM13212d = null;
        int i2 = 1;
        switch (this.f63960a) {
            case 0:
                wi5 wi5Var = (wi5) this.f63961b;
                vl4 vl4Var = (vl4) this.f63962c;
                bk8 bk8Var = (bk8) obj;
                bk8Var.getClass();
                wi5Var.f66851M.m3841W(bk8Var, vl4Var);
                return xfa.f68157a;
            case 1:
                lm6 lm6Var = (lm6) this.f63961b;
                ArrayList arrayList = (ArrayList) this.f63962c;
                bk8 bk8Var2 = (bk8) obj;
                bk8Var2.getClass();
                return lm6Var.f49835L.m3843Y(bk8Var2, arrayList);
            case 2:
                String str = (String) this.f63961b;
                String str2 = (String) this.f63962c;
                bk8 bk8Var3 = (bk8) obj;
                bk8Var3.getClass();
                ik8 ik8VarMo2873e0 = bk8Var3.mo2873e0("SELECT `id`, `title`, `startDate`, `endDate`, `noticeType` FROM (SELECT * FROM NoticeEntity WHERE language = ? AND noticeType = ? AND isShown = 0 AND ? >= startDate AND ? <= endDate ORDER BY startDate)");
                try {
                    ik8VarMo2873e0.mo2874C(1, str);
                    ik8VarMo2873e0.mo2874C(2, "monthly_challenges");
                    ik8VarMo2873e0.mo2874C(3, str2);
                    ik8VarMo2873e0.mo2874C(4, str2);
                    ArrayList arrayList2 = new ArrayList();
                    while (ik8VarMo2873e0.mo2876a0()) {
                        arrayList2.add(new Notice((int) ik8VarMo2873e0.getLong(0), ik8VarMo2873e0.mo2875L(1), ik8VarMo2873e0.mo2875L(3), ik8VarMo2873e0.mo2875L(2), ik8VarMo2873e0.mo2875L(4)));
                    }
                    ik8VarMo2873e0.close();
                    return arrayList2;
                } catch (Throwable th2) {
                    ik8VarMo2873e0.close();
                    throw th2;
                }
            case 3:
                xp6 xp6Var = (xp6) this.f63961b;
                ArrayList arrayList3 = (ArrayList) this.f63962c;
                bk8 bk8Var4 = (bk8) obj;
                bk8Var4.getClass();
                return xp6Var.f68494L.m3843Y(bk8Var4, arrayList3);
            case 4:
                nq6 nq6Var = (nq6) this.f63961b;
                l87 l87Var = (l87) this.f63962c;
                AbstractC0343j abstractC0343j = (AbstractC0343j) obj;
                boolean z = nq6Var.f53138L;
                float f = nq6Var.f53136J;
                if (z) {
                    AbstractC0343j.m1521j(abstractC0343j, l87Var, abstractC0343j.mo916w0(f), abstractC0343j.mo916w0(nq6Var.f53137K));
                } else {
                    abstractC0343j.m1530f(l87Var, abstractC0343j.mo916w0(f), abstractC0343j.mo916w0(nq6Var.f53137K), 0.0f);
                }
                return xfa.f68157a;
            case 5:
                qq6 qq6Var = (qq6) this.f63961b;
                l87 l87Var2 = (l87) this.f63962c;
                AbstractC0343j abstractC0343j2 = (AbstractC0343j) obj;
                long j = ((f84) qq6Var.f58080J.invoke(abstractC0343j2)).f38612a;
                if (qq6Var.f58081K) {
                    AbstractC0343j.m1522l(abstractC0343j2, l87Var2, (int) (j >> 32), (int) (j & 4294967295L), null, 12);
                } else {
                    AbstractC0343j.m1525p(abstractC0343j2, l87Var2, (int) (j >> 32), (int) (j & 4294967295L), null, 12);
                }
                return xfa.f68157a;
            case 6:
                s17 s17Var = (s17) this.f63961b;
                l87 l87Var3 = (l87) this.f63962c;
                AbstractC0343j abstractC0343j3 = (AbstractC0343j) obj;
                boolean z2 = s17Var.f60156N;
                float f2 = s17Var.f60152J;
                if (z2) {
                    AbstractC0343j.m1521j(abstractC0343j3, l87Var3, abstractC0343j3.mo916w0(f2), abstractC0343j3.mo916w0(s17Var.f60153K));
                } else {
                    abstractC0343j3.m1530f(l87Var3, abstractC0343j3.mo916w0(f2), abstractC0343j3.mo916w0(s17Var.f60153K), 0.0f);
                }
                return xfa.f68157a;
            case 7:
                t66 t66Var = (t66) this.f63961b;
                AbstractC0343j abstractC0343j4 = (AbstractC0343j) obj;
                C3542rn c3542rn = new C3542rn(1, (ArrayList) this.f63962c);
                abstractC0343j4.f4216a = true;
                c3542rn.invoke(abstractC0343j4);
                abstractC0343j4.f4216a = false;
                t66Var.getValue();
                return xfa.f68157a;
            case 8:
                String str3 = (String) this.f63961b;
                List list = (List) this.f63962c;
                bk8 bk8Var5 = (bk8) obj;
                bk8Var5.getClass();
                ik8 ik8VarMo2873e1 = bk8Var5.mo2873e0(str3);
                try {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        ik8VarMo2873e1.mo2878j(i2, ((Number) it.next()).intValue());
                        i2++;
                    }
                    ik8VarMo2873e1.mo2876a0();
                    return xfa.f68157a;
                } finally {
                    ik8VarMo2873e1.close();
                }
            case 9:
                C1833i c1833i = (C1833i) this.f63961b;
                ld7 ld7Var = (ld7) this.f63962c;
                String str4 = (String) obj;
                str4.getClass();
                c1833i.m8512Y2(ld7Var.m16100b(), str4);
                return xfa.f68157a;
            case 10:
                ri7 ri7Var = (ri7) this.f63961b;
                qi7 qi7Var = (qi7) this.f63962c;
                bk8 bk8Var6 = (bk8) obj;
                bk8Var6.getClass();
                ri7Var.f59366b.m20400B(bk8Var6, qi7Var);
                return xfa.f68157a;
            case 11:
                pf1 pf1Var = (pf1) this.f63961b;
                o66 o66Var = (o66) this.f63962c;
                pf1Var.m19110z(obj);
                if (o66Var != null) {
                    o66Var.m17811d(obj);
                }
                return xfa.f68157a;
            case 12:
                C0281i c0281i = (C0281i) this.f63961b;
                Throwable th3 = (Throwable) this.f63962c;
                Throwable th4 = (Throwable) obj;
                synchronized (c0281i.f3757d) {
                    if (th3 != null) {
                        if (th4 != null) {
                            try {
                                Throwable th5 = th4 instanceof CancellationException ? null : th4;
                                if (th5 != null) {
                                    lda.m16117c(th3, th5);
                                }
                            } catch (Throwable th6) {
                                throw th6;
                            }
                        }
                        th = th3;
                    }
                    c0281i.f3759f = th;
                    c0281i.f3776w.m15571i(Recomposer$State.ShutDown);
                }
                return xfa.f68157a;
            case 13:
                ((xc9) ((z66) this.f63961b).f70987a).setValue(new tu2((e5b) this.f63962c, (e5b) obj));
                return xfa.f68157a;
            case 14:
                ho8 ho8Var = (ho8) this.f63961b;
                C0116v c0116v = (C0116v) this.f63962c;
                pk2 pk2Var = (pk2) obj;
                float f3 = pk2Var.f56335b ? -1.0f : 1.0f;
                long j2 = pk2Var.f56334a;
                ho8Var.m13413a(1, gq6.m12826g(f3, c0116v.f2363d == Orientation.Horizontal ? gq6.m12820a(j2, 0.0f, 1) : gq6.m12820a(j2, 0.0f, 2)));
                return xfa.f68157a;
            case 15:
                ui3 ui3Var = (ui3) this.f63961b;
                t66 t66Var2 = (t66) this.f63962c;
                x89 x89Var = (x89) obj;
                float fFloatValue = ((Number) ui3Var.mo0a()).floatValue();
                float fIntBitsToFloat = Float.intBitsToFloat((int) (x89Var.f67935a >> 32)) * fFloatValue;
                float fIntBitsToFloat2 = Float.intBitsToFloat((int) (x89Var.f67935a & 4294967295L)) * fFloatValue;
                if (Float.intBitsToFloat((int) (((x89) t66Var2.getValue()).f67935a >> 32)) != fIntBitsToFloat || Float.intBitsToFloat((int) (((x89) t66Var2.getValue()).f67935a & 4294967295L)) != fIntBitsToFloat2) {
                    t66Var2.setValue(new x89((((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L)));
                }
                return xfa.f68157a;
            case 16:
                return new d70(i, (t66) this.f63961b, (v56) this.f63962c);
            case 17:
                C0180h c0180h = (C0180h) this.f63961b;
                C3378nn c3378nn = (C3378nn) this.f63962c;
                q98 q98Var = (q98) obj;
                C3419on c3419on = c0180h.f2908b;
                t66 t66Var3 = c0180h.f2907a;
                rw9 rw9Var2 = (rw9) ((xc9) t66Var3).getValue();
                if (fa4.m11650l(c3419on, (rw9Var2 == null || (qw9Var = rw9Var2.f59975a) == null) ? null : qw9Var.f58295a) && (rw9Var = (rw9) ((xc9) t66Var3).getValue()) != null) {
                    w46 w46Var = rw9Var.f59976b;
                    C3378nn c3378nnM1076c = C0180h.m1076c(c3378nn, rw9Var);
                    if (c3378nnM1076c == null) {
                        c3500qjM20962i = null;
                    } else {
                        int i3 = c3378nnM1076c.f52981c;
                        int i4 = c3378nnM1076c.f52980b;
                        c3500qjM20962i = rw9Var.m20962i(i4, i3);
                        e28 e28VarM20955b = rw9Var.m20955b(i4);
                        int i5 = i3 - 1;
                        c3500qjM20962i.m19994k(((((long) Float.floatToRawIntBits(w46Var.m23743d(i4) == w46Var.m23743d(i5) ? Math.min(rw9Var.m20955b(i5).f36620a, e28VarM20955b.f36620a) : 0.0f)) << 32) | (((long) Float.floatToRawIntBits(e28VarM20955b.f36621b)) & 4294967295L)) ^ (-9223372034707292160L));
                    }
                } else {
                    c3500qjM20962i = null;
                }
                vw9 vw9Var = c3500qjM20962i != null ? new vw9(c3500qjM20962i) : null;
                if (vw9Var != null) {
                    q98Var.m19826s(vw9Var);
                    q98Var.m19816f(true);
                }
                return xfa.f68157a;
            case 18:
                C3378nn c3378nn2 = (C3378nn) this.f63961b;
                sc9 sc9Var = ((he5) this.f63962c).f42258b;
                rs9 rs9Var = (rs9) obj;
                fe5 fe5Var = (fe5) c3378nn2.f52979a;
                ww9 ww9VarMo10312b4 = fe5Var.mo10312b();
                he9 he9Var = ww9VarMo10312b4 != null ? ww9VarMo10312b4.f67431a : null;
                he9 he9VarM13212d2 = ((sc9Var.m21222h() & 1) == 0 || (ww9VarMo10312b3 = fe5Var.mo10312b()) == null) ? null : ww9VarMo10312b3.f67432b;
                if (he9Var != null) {
                    he9VarM13212d2 = he9Var.m13212d(he9VarM13212d2);
                }
                he9 he9VarM13212d3 = ((sc9Var.m21222h() & 2) == 0 || (ww9VarMo10312b2 = fe5Var.mo10312b()) == null) ? null : ww9VarMo10312b2.f67433c;
                if (he9VarM13212d2 != null) {
                    he9VarM13212d3 = he9VarM13212d2.m13212d(he9VarM13212d3);
                }
                if ((sc9Var.m21222h() & 4) != 0 && (ww9VarMo10312b = fe5Var.mo10312b()) != null) {
                    he9VarM13212d = ww9VarMo10312b.f67434d;
                }
                if (he9VarM13212d3 != null) {
                    he9VarM13212d = he9VarM13212d3.m13212d(he9VarM13212d);
                }
                rs9Var.f59768b = rs9Var.f59767a.m18173c(new bb0(new Ref$BooleanRef(), c3378nn2, he9VarM13212d, 16));
                return xfa.f68157a;
            case 19:
                List list2 = (List) this.f63961b;
                List list3 = (List) this.f63962c;
                AbstractC0343j abstractC0343j5 = (AbstractC0343j) obj;
                if (list2 != null) {
                    int size = list2.size();
                    for (int i6 = 0; i6 < size; i6++) {
                        Pair pair = (Pair) list2.get(i6);
                        AbstractC0343j.m1520i(abstractC0343j5, (l87) pair.f47623a, ((f84) pair.f47624b).f38612a);
                    }
                }
                if (list3 != null) {
                    int size2 = list3.size();
                    for (int i7 = 0; i7 < size2; i7++) {
                        Pair pair2 = (Pair) list3.get(i7);
                        l87 l87Var4 = (l87) pair2.f47623a;
                        ui3 ui3Var2 = (ui3) pair2.f47624b;
                        AbstractC0343j.m1520i(abstractC0343j5, l87Var4, ui3Var2 != null ? ((f84) ui3Var2.mo0a()).f38612a : 0L);
                    }
                }
                return xfa.f68157a;
            case 20:
                faa faaVar = (faa) this.f63961b;
                faa faaVar2 = (faa) this.f63962c;
                faaVar.f38744j.add(faaVar2);
                return new d70(5, faaVar, faaVar2);
            case 21:
                return new d70(6, (faa) this.f63961b, (v9a) this.f63962c);
            case 22:
                faa faaVar3 = (faa) this.f63961b;
                baa baaVar = (baa) this.f63962c;
                faaVar3.f38743i.add(baaVar);
                return new d70(7, faaVar3, baaVar);
            case DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER /* 23 */:
                fs6 fs6Var = (fs6) this.f63961b;
                tda tdaVar = (tda) this.f63962c;
                wda wdaVar = (wda) obj;
                synchronized (((s46) fs6Var.f39590b)) {
                    try {
                        boolean zMo22699a = wdaVar.mo22699a();
                        ab9 ab9Var = (ab9) fs6Var.f39591c;
                        if (zMo22699a) {
                        }
                    } catch (Throwable th7) {
                        throw th7;
                    }
                }
                return xfa.f68157a;
            case 24:
                C0119y c0119y = (C0119y) this.f63961b;
                vi3 vi3Var = (vi3) this.f63962c;
                ((Long) obj).getClass();
                float f4 = c0119y.f2381e;
                c0119y.f2381e = 0.0f;
                vi3Var.invoke(Float.valueOf(f4));
                return xfa.f68157a;
            default:
                l6b l6bVar = (l6b) this.f63961b;
                View view = (View) this.f63962c;
                l6bVar.m15909a(view);
                return new d70(8, l6bVar, view);
        }
    }

    public /* synthetic */ ui5(Object obj, Object obj2, Object obj3, int i) {
        this.f63960a = i;
        this.f63961b = obj2;
        this.f63962c = obj3;
    }
}
