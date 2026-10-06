package p000;

import com.google.googlex.gcam.BurstSpec;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class eci implements ech {

    /* JADX INFO: renamed from: a */
    private final Set f13350a;

    /* JADX INFO: renamed from: b */
    private final kbz f13351b;

    public eci(Set set, kbz kbzVar) {
        set.size();
        this.f13350a = set;
        this.f13351b = kbzVar;
    }

    @Override // p000.ech
    /* JADX INFO: renamed from: d */
    public final void mo7111d(gyu gyuVar) {
        for (ech echVar : this.f13350a) {
            this.f13351b.mo13961e("abort#".concat(String.valueOf(echVar.getClass().getName())));
            echVar.mo7111d(gyuVar);
            this.f13351b.mo13962f();
        }
    }

    @Override // p000.ech
    /* JADX INFO: renamed from: e */
    public final void mo7112e(eem eemVar, key keyVar) {
        for (ech echVar : this.f13350a) {
            this.f13351b.mo13961e("addPayload#".concat(String.valueOf(echVar.getClass().getName())));
            key keyVarMo7040a = keyVar.mo7040a();
            if (keyVarMo7040a != null) {
                echVar.mo7112e(eemVar, keyVarMo7040a);
            } else {
                keyVar.mo7041b();
                echVar.mo7112e(eemVar, new ebd(keyVar.mo7041b(), keyVar.mo7049j(), keyVar.mo7042c()));
            }
            this.f13351b.mo13962f();
        }
    }

    @Override // p000.ech
    /* JADX INFO: renamed from: f */
    public final void mo7113f(eem eemVar, BurstSpec burstSpec, kpp kppVar) {
        for (ech echVar : this.f13350a) {
            this.f13351b.mo13961e("begin#".concat(String.valueOf(echVar.getClass().getName())));
            echVar.mo7113f(eemVar, burstSpec, kppVar);
            this.f13351b.mo13962f();
        }
    }

    @Override // p000.ech
    /* JADX INFO: renamed from: g */
    public final void mo7114g(gyu gyuVar) {
        for (ech echVar : this.f13350a) {
            this.f13351b.mo13961e("start#".concat(String.valueOf(echVar.getClass().getName())));
            echVar.mo7114g(gyuVar);
            this.f13351b.mo13962f();
        }
    }

    @Override // p000.ech
    /* JADX INFO: renamed from: h */
    public final void mo7115h(eem eemVar) {
        for (ech echVar : this.f13350a) {
            this.f13351b.mo13961e("endPayload#".concat(String.valueOf(echVar.getClass().getName())));
            echVar.mo7115h(eemVar);
            this.f13351b.mo13962f();
        }
    }

    @Override // p000.ech
    /* JADX INFO: renamed from: i */
    public final void mo7116i(eem eemVar) {
        for (ech echVar : this.f13350a) {
            this.f13351b.mo13961e("endZslPayload#".concat(String.valueOf(echVar.getClass().getName())));
            echVar.mo7116i(eemVar);
            this.f13351b.mo13962f();
        }
    }
}
