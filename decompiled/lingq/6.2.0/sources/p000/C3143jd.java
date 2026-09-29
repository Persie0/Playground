package p000;

import android.media.MediaPlayer;
import com.lingq.core.premium.upgrade.AiVoiceSampleState;
import kotlin.Result;
import kotlinx.coroutines.flow.AbstractC3224d;
import kotlinx.coroutines.flow.C3244l;

/* JADX INFO: renamed from: jd */
/* JADX INFO: loaded from: classes2.dex */
public final class C3143jd extends wta {
    private static final C3071hd Companion = new C3071hd();

    /* JADX INFO: renamed from: b */
    public final C3156jq f45430b;

    /* JADX INFO: renamed from: c */
    public final C3244l f45431c;

    /* JADX INFO: renamed from: d */
    public final c18 f45432d;

    /* JADX INFO: renamed from: e */
    public MediaPlayer f45433e;

    public C3143jd(C3156jq c3156jq) {
        this.f45430b = c3156jq;
        AiVoiceSampleState aiVoiceSampleState = AiVoiceSampleState.Idle;
        C3244l c3244lM17114d = AbstractC3352my.m17114d(aiVoiceSampleState);
        this.f45431c = c3244lM17114d;
        this.f45432d = AbstractC3224d.m15520B(c3244lM17114d, lda.m16103C(this), xi9.f68262a, aiVoiceSampleState);
    }

    @Override // p000.wta
    /* JADX INFO: renamed from: U2 */
    public final void mo8918U2() {
        m14399V2();
    }

    /* JADX INFO: renamed from: V2 */
    public final void m14399V2() {
        try {
            MediaPlayer mediaPlayer = this.f45433e;
            if (mediaPlayer != null) {
                mediaPlayer.release();
            }
        } catch (Throwable th) {
            new Result.Failure(th);
        }
        this.f45433e = null;
    }

    /* JADX INFO: renamed from: W2 */
    public final void m14400W2() {
        this.f45431c.m15571i(AiVoiceSampleState.Idle);
        m14399V2();
    }
}
