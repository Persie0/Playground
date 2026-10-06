package p000;

import android.os.SystemClock;
import java.util.EnumMap;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class hgb {

    /* JADX INFO: renamed from: a */
    public final hah f27655a;

    /* JADX INFO: renamed from: b */
    public final hai f27656b;

    /* JADX INFO: renamed from: c */
    public boolean f27657c;

    /* JADX INFO: renamed from: e */
    private final fcp f27659e;

    /* JADX INFO: renamed from: f */
    private final jwn f27660f;

    /* JADX INFO: renamed from: g */
    private final Map f27661g = new EnumMap(hga.class);

    /* JADX INFO: renamed from: d */
    public final nxl f27658d = nlr.f43575j.m18137O();

    public hgb(fcp fcpVar, jww jwwVar, hah hahVar, hai haiVar) {
        this.f27659e = fcpVar;
        this.f27660f = jwwVar;
        this.f27655a = hahVar;
        this.f27656b = haiVar;
    }

    /* JADX INFO: renamed from: a */
    final void m10230a() {
        m10231b();
        m10233d(hga.POPUP_SHARE_HANDLE);
        m10235f(2);
    }

    /* JADX INFO: renamed from: b */
    final void m10231b() {
        lku.m15613H(!this.f27657c);
        this.f27657c = true;
        this.f27661g.clear();
        nxl nxlVar = this.f27658d;
        if (nxlVar.f44973a.m18142ac()) {
            throw new IllegalArgumentException("Default instance must be immutable.");
        }
        nxlVar.f44974b = nxlVar.m18102k();
    }

    /* JADX WARN: Code duplicated, block: B:25:0x00ad  */
    /* JADX INFO: renamed from: c */
    final void m10232c() {
        lku.m15613H(this.f27657c);
        nxl nxlVar = this.f27658d;
        boolean zBooleanValue = ((Boolean) this.f27655a.mo10031c(gzy.f27006R)).booleanValue();
        if (!nxlVar.f44974b.m18142ac()) {
            nxlVar.mo18106p();
        }
        nlr nlrVar = (nlr) nxlVar.f44974b;
        nlr nlrVar2 = nlr.f43575j;
        nlrVar.f43577a |= 64;
        nlrVar.f43584h = zBooleanValue;
        nxl nxlVar2 = this.f27658d;
        boolean zBooleanValue2 = ((Boolean) this.f27655a.mo10031c(gzy.f27005Q)).booleanValue();
        if (!nxlVar2.f44974b.m18142ac()) {
            nxlVar2.mo18106p();
        }
        nlr nlrVar3 = (nlr) nxlVar2.f44974b;
        nlrVar3.f43577a |= 128;
        nlrVar3.f43585i = zBooleanValue2;
        if (((nlr) this.f27658d.f44974b).f43583g.isEmpty()) {
            nlr nlrVar4 = (nlr) this.f27658d.f44974b;
            int i = nlrVar4.f43579c;
            int i2 = nlrVar4.f43580d;
        } else {
            nlr nlrVar5 = (nlr) this.f27658d.f44974b;
            int iM15004av = kxk.m15004av(nlrVar5.f43580d);
            if (iM15004av == 0 || iM15004av == 1) {
                int iM15005aw = kxk.m15005aw(nlrVar5.f43579c);
                boolean z = iM15005aw == 0 || iM15005aw == 1;
                lku.m15613H(!z);
                nxl nxlVar3 = this.f27658d;
                if (!nxlVar3.f44974b.m18142ac()) {
                    nxlVar3.mo18106p();
                }
                nlr nlrVar6 = (nlr) nxlVar3.f44974b;
                nlrVar6.f43577a |= 1;
                nlrVar6.f43578b = true;
                nlr nlrVar7 = (nlr) this.f27658d.f44974b;
                String str = nlrVar7.f43583g;
                int i3 = nlrVar7.f43579c;
            } else {
                nlr nlrVar8 = (nlr) this.f27658d.f44974b;
                int i4 = nlrVar8.f43579c;
                int i5 = nlrVar8.f43580d;
            }
        }
        this.f27659e.mo8149X(iku.m11411e((ikw) this.f27660f.mo3831be()), null, null, (nlr) this.f27658d.mo18103l(), null);
        this.f27657c = false;
    }

    /* JADX INFO: renamed from: d */
    final void m10233d(hga hgaVar) {
        lku.m15613H(this.f27657c);
        lku.m15613H(!this.f27661g.containsKey(hgaVar));
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        this.f27661g.put(hgaVar, Long.valueOf(jElapsedRealtime));
        hga hgaVar2 = hga.POPUP_SHARE_HANDLE;
        switch (hgaVar.ordinal()) {
            case 1:
                Long l = (Long) this.f27661g.get(hga.POPUP_SHARE_HANDLE);
                if (l != null) {
                    long jLongValue = jElapsedRealtime - l.longValue();
                    nxl nxlVar = this.f27658d;
                    if (!nxlVar.f44974b.m18142ac()) {
                        nxlVar.mo18106p();
                    }
                    int i = (int) jLongValue;
                    nlr nlrVar = (nlr) nxlVar.f44974b;
                    nlr nlrVar2 = nlr.f43575j;
                    nlrVar.f43577a |= 8;
                    nlrVar.f43581e = i;
                }
                break;
            case 2:
                Long l2 = (Long) this.f27661g.get(hga.LAUNCH_SHARE_PANEL);
                l2.getClass();
                long jLongValue2 = jElapsedRealtime - l2.longValue();
                nxl nxlVar2 = this.f27658d;
                if (!nxlVar2.f44974b.m18142ac()) {
                    nxlVar2.mo18106p();
                }
                int i2 = (int) jLongValue2;
                nlr nlrVar3 = (nlr) nxlVar2.f44974b;
                nlr nlrVar4 = nlr.f43575j;
                nlrVar3.f43577a |= 16;
                nlrVar3.f43582f = i2;
                break;
            default:
                hgaVar.name();
                break;
        }
    }

    /* JADX INFO: renamed from: e */
    final void m10234e(int i) {
        lku.m15613H(this.f27657c);
        nxl nxlVar = this.f27658d;
        if (!nxlVar.f44974b.m18142ac()) {
            nxlVar.mo18106p();
        }
        nlr nlrVar = (nlr) nxlVar.f44974b;
        nlr nlrVar2 = nlr.f43575j;
        nlrVar.f43579c = i - 1;
        nlrVar.f43577a |= 2;
    }

    /* JADX INFO: renamed from: f */
    final void m10235f(int i) {
        lku.m15613H(this.f27657c);
        nxl nxlVar = this.f27658d;
        if (!nxlVar.f44974b.m18142ac()) {
            nxlVar.mo18106p();
        }
        nlr nlrVar = (nlr) nxlVar.f44974b;
        nlr nlrVar2 = nlr.f43575j;
        nlrVar.f43580d = i - 1;
        nlrVar.f43577a |= 4;
    }
}
