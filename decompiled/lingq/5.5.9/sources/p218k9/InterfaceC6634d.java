package p218k9;

import com.google.android.exoplayer2.decoder.DecoderException;
import p219ka.C6649j;

/* JADX INFO: renamed from: k9.d */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC6634d<I, O, E extends DecoderException> {
    /* JADX INFO: renamed from: a */
    void mo13271a(C6649j c6649j) throws DecoderException;

    /* JADX INFO: renamed from: c */
    O mo13272c() throws DecoderException;

    /* JADX INFO: renamed from: d */
    I mo13273d() throws DecoderException;

    void flush();

    void release();
}
