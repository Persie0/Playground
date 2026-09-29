package p000;

import com.lingq.core.data.repository.C1294j;
import com.lingq.core.domain.model.language.AppUsageType;
import com.lingq.core.domain.model.user.ProfileAccount;
import java.util.Calendar;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.coroutines.Continuation;

/* JADX INFO: renamed from: xs */
/* JADX INFO: loaded from: classes.dex */
public final class C3770xs implements InterfaceC3733ws, cma {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ cma f68594a;

    /* JADX INFO: renamed from: b */
    public final oo4 f68595b;

    /* JADX INFO: renamed from: c */
    public final LinkedHashMap f68596c;

    /* JADX INFO: renamed from: d */
    public final LinkedHashMap f68597d;

    public C3770xs(oo4 oo4Var, cma cmaVar) {
        oo4Var.getClass();
        cmaVar.getClass();
        this.f68594a = cmaVar;
        this.f68595b = oo4Var;
        this.f68596c = new LinkedHashMap();
        this.f68597d = new LinkedHashMap();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: A */
    public final c83 mo4571A() {
        return this.f68594a.mo4571A();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: B0 */
    public final eh9 mo4572B0() {
        return this.f68594a.mo4572B0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: B1 */
    public final eh9 mo4573B1() {
        return this.f68594a.mo4573B1();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: C1 */
    public final c83 mo4574C1() {
        return this.f68594a.mo4574C1();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: D0 */
    public final Object mo4575D0(Continuation continuation) {
        return this.f68594a.mo4575D0(continuation);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: F1 */
    public final Object mo4576F1(String str, Continuation continuation) {
        return this.f68594a.mo4576F1(str, continuation);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: H */
    public final eh9 mo4577H() {
        return this.f68594a.mo4577H();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: J */
    public final Object mo4578J(Continuation continuation) {
        return this.f68594a.mo4578J(continuation);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: K */
    public final Object mo4579K(Continuation continuation) {
        return this.f68594a.mo4579K(continuation);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: K1 */
    public final String mo4580K1() {
        return this.f68594a.mo4580K1();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: L0 */
    public final boolean mo4581L0() {
        return this.f68594a.mo4581L0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: N */
    public final c83 mo4582N() {
        return this.f68594a.mo4582N();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: O1 */
    public final c83 mo4583O1() {
        return this.f68594a.mo4583O1();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: Q0 */
    public final int mo4584Q0() {
        return this.f68594a.mo4584Q0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: R */
    public final eh9 mo4585R() {
        return this.f68594a.mo4585R();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: T0 */
    public final boolean mo4586T0() {
        return this.f68594a.mo4586T0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: X */
    public final void mo4587X() {
        this.f68594a.mo4587X();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: a0 */
    public final boolean mo4588a0() {
        return this.f68594a.mo4588a0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: b2 */
    public final String mo4589b2() {
        return this.f68594a.mo4589b2();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: d0 */
    public final boolean mo4590d0() {
        return this.f68594a.mo4590d0();
    }

    @Override // p000.InterfaceC3733ws
    /* JADX INFO: renamed from: h */
    public final Map mo9032h() {
        return this.f68596c;
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: h0 */
    public final Object mo4591h0(ProfileAccount profileAccount, Continuation continuation) {
        return this.f68594a.mo4591h0(profileAccount, continuation);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: m0 */
    public final boolean mo4592m0() {
        return this.f68594a.mo4592m0();
    }

    @Override // p000.InterfaceC3733ws
    /* JADX INFO: renamed from: o1 */
    public final void mo9033o1(AppUsageType appUsageType, Integer num) {
        appUsageType.getClass();
        LinkedHashMap linkedHashMap = this.f68596c;
        if (((Long) linkedHashMap.get(appUsageType)) == null) {
            linkedHashMap.put(appUsageType, Long.valueOf(Calendar.getInstance().getTimeInMillis()));
            if (num != null) {
                this.f68597d.put(appUsageType, num);
            }
        }
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: p0 */
    public final boolean mo4593p0() {
        return this.f68594a.mo4593p0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: r1 */
    public final eh9 mo4594r1() {
        return this.f68594a.mo4594r1();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: s1 */
    public final boolean mo4595s1() {
        return this.f68594a.mo4595s1();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: t */
    public final c83 mo4596t() {
        return this.f68594a.mo4596t();
    }

    @Override // p000.InterfaceC3733ws
    /* JADX INFO: renamed from: v0 */
    public final void mo9034v0(AppUsageType appUsageType) {
        appUsageType.getClass();
        LinkedHashMap linkedHashMap = this.f68596c;
        Long l = (Long) linkedHashMap.get(appUsageType);
        if (l != null) {
            long jLongValue = l.longValue();
            Integer num = (Integer) this.f68597d.remove(appUsageType);
            String strMo4589b2 = this.f68594a.mo4589b2();
            String key = appUsageType.getKey();
            double timeInMillis = (Calendar.getInstance().getTimeInMillis() - jLongValue) / 1000;
            C1294j c1294j = (C1294j) this.f68595b;
            c1294j.getClass();
            strMo4589b2.getClass();
            key.getClass();
            if (key.equals(AppUsageType.Reading.getKey()) || key.equals(AppUsageType.Listening.getKey()) || key.equals(AppUsageType.Review.getKey()) || key.equals(AppUsageType.Speaking.getKey())) {
                c1294j.m7227a(strMo4589b2, key, timeInMillis, num);
            }
        }
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: w0 */
    public final Object mo4597w0(Continuation continuation) {
        return this.f68594a.mo4597w0(continuation);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: w2 */
    public final boolean mo4598w2() {
        return this.f68594a.mo4598w2();
    }
}
