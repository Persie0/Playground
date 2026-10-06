package p000;

import android.media.AudioFormat;
import android.media.AudioRouting;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public interface knr extends AutoCloseable, AudioRouting {
    /* JADX INFO: renamed from: a */
    int mo5426a();

    /* JADX INFO: renamed from: b */
    AudioFormat mo5427b();

    /* JADX INFO: renamed from: c */
    void mo5428c();

    @Override // java.lang.AutoCloseable
    void close();

    /* JADX INFO: renamed from: d */
    void mo5429d();

    /* JADX INFO: renamed from: e */
    khb mo5430e(ByteBuffer byteBuffer, int i);
}
