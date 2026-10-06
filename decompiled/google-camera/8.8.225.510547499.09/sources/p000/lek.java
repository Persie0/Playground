package p000;

import android.media.AudioFormat;
import android.media.AudioRouting;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public interface lek extends AutoCloseable, AudioRouting {
    /* JADX INFO: renamed from: a */
    AudioFormat mo15249a();

    /* JADX INFO: renamed from: b */
    lej mo15250b(ByteBuffer byteBuffer, int i);

    /* JADX INFO: renamed from: c */
    void mo15251c();

    @Override // java.lang.AutoCloseable
    void close();

    /* JADX INFO: renamed from: d */
    void mo15252d();
}
