package p000;

import android.os.SystemClock;
import com.google.android.apps.camera.legacy.app.activity.main.kuX.PMZiHihxLGEy;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class fst implements fth {

    /* JADX INFO: renamed from: a */
    public final Object f23509a;

    /* JADX INFO: renamed from: b */
    public final Object f23510b;

    /* JADX INFO: renamed from: c */
    public final Object f23511c;

    /* JADX INFO: renamed from: d */
    public final Object f23512d;

    /* JADX INFO: renamed from: e */
    private final /* synthetic */ int f23513e;

    /* JADX INFO: renamed from: f */
    private final Object f23514f;

    /* JADX INFO: renamed from: g */
    private final Object f23515g;

    public fst(kol kolVar, fth fthVar, int i) {
        this.f23513e = i;
        this.f23515g = fthVar;
        this.f23514f = kolVar.m14623b(PMZiHihxLGEy.gUpRpoBIVCG, new koc[0]);
        this.f23512d = kolVar.m14623b("/gca/moments/hdr_finish_count", koc.m14617b("result"));
        this.f23510b = kolVar.m14623b("/gca/moments/hdr_images_closed_count", new koc[0]);
        this.f23511c = kolVar.m14624c("/gca/moments/hdr_processing_time_ms", koc.m14617b("result"));
        this.f23509a = kolVar.m14624c("/gca/moments/hdr_result_open_ms", new koc[0]);
    }

    @Override // p000.fth
    /* JADX INFO: renamed from: b */
    public final boolean mo8695b(key keyVar, gva gvaVar) {
        int i = this.f23513e;
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [dhv, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v2, types: [dhv, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v6, types: [fth] */
    /* JADX WARN: Type inference failed for: r0v7, types: [fth, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v9, types: [dhv, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v10, types: [dhv, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v4, types: [dhv, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v9, types: [java.lang.Object, kbo] */
    /* JADX WARN: Type inference failed for: r6v0, types: [fth, java.lang.Object] */
    @Override // p000.fth
    /* JADX INFO: renamed from: c */
    public final void mo8696c(key keyVar, fua fuaVar, npk npkVar, ftg ftgVar) {
        ?? r0;
        switch (this.f23513e) {
            case 0:
                if (fuaVar.f23581i && this.f23515g.mo6184l(dij.f11576Z) && this.f23515g.mo6184l(dii.f11537m)) {
                    r0 = this.f23511c;
                } else {
                    r0 = this.f23515g.mo6184l(dij.f11595s) ? this.f23510b : this.f23509a;
                }
                boolean zMo8695b = r0.mo8695b(keyVar, (gva) this.f23512d);
                ?? r1 = r0;
                if (!zMo8695b) {
                    r1 = this.f23509a;
                }
                if (this.f23515g.mo6184l(dij.f11595s) && this.f23515g.mo6184l(dij.f11573W) && r1 == this.f23509a) {
                    ftgVar.mo8682a();
                    return;
                }
                if (r1.mo8695b(keyVar, (gva) this.f23512d)) {
                    this.f23514f.mo13940b("Processing frames with ".concat(String.valueOf(r1.getClass().getSimpleName())));
                    r1.mo8696c(keyVar, fuaVar, npkVar, ftgVar);
                    return;
                }
                throw new IllegalStateException("Cannot find an HdrPlusLauncher to process frame " + keyVar.toString() + "!");
            default:
                this.f23515g.mo8696c(keyVar, fuaVar, npkVar, new fpv(this, SystemClock.elapsedRealtime(), ftgVar, null));
                ((ktz) this.f23514f).m14852d(new Object[0]);
                return;
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [dhv, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v2, types: [fth, java.lang.Object] */
    @Override // p000.fth
    /* JADX INFO: renamed from: a */
    public final int mo8694a() {
        switch (this.f23513e) {
            case 0:
                this.f23515g.mo6184l(dij.f11595s);
                break;
            default:
                this.f23515g.mo8694a();
                break;
        }
        return 1;
    }

    public fst(kbo kboVar, dhv dhvVar, frk frkVar, fqg fqgVar, fqb fqbVar, gva gvaVar, int i, byte[] bArr) {
        this.f23513e = i;
        this.f23514f = kboVar.mo6314a("SwitcherHdrPlus");
        this.f23515g = dhvVar;
        this.f23509a = frkVar;
        this.f23510b = fqgVar;
        this.f23511c = fqbVar;
        this.f23512d = gvaVar;
    }
}
