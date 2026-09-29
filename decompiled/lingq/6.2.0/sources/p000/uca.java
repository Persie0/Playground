package p000;

import android.speech.tts.UtteranceProgressListener;
import com.lingq.core.player.tts.C1819c;
import kotlinx.coroutines.flow.C3244l;

/* JADX INFO: loaded from: classes2.dex */
public final class uca extends UtteranceProgressListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C1819c f63722a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f63723b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ boolean f63724c;

    public uca(C1819c c1819c, String str, boolean z) {
        this.f63722a = c1819c;
        this.f63723b = str;
        this.f63724c = z;
    }

    @Override // android.speech.tts.UtteranceProgressListener
    public final void onDone(String str) {
        this.f63722a.m8490k(this.f63723b, this.f63724c);
    }

    @Override // android.speech.tts.UtteranceProgressListener
    public final void onError(String str) {
        this.f63722a.m8490k(this.f63723b, this.f63724c);
    }

    @Override // android.speech.tts.UtteranceProgressListener
    public final void onStart(String str) {
        Object value;
        C3244l c3244l = this.f63722a.f22174l;
        do {
            value = c3244l.getValue();
        } while (!c3244l.m15570h(value, new ada(this.f63723b, true, this.f63724c, false)));
    }

    @Override // android.speech.tts.UtteranceProgressListener
    public final void onError(String str, int i) {
        this.f63722a.m8490k(this.f63723b, this.f63724c);
    }
}
