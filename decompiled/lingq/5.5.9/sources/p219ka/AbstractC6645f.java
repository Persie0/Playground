package p219ka;

import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.text.SubtitleDecoderException;
import java.nio.ByteBuffer;
import p218k9.AbstractC6636f;
import p218k9.AbstractC6638h;
import p479xa.C10129a;

/* JADX INFO: renamed from: ka.f */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6645f extends AbstractC6638h<C6649j, AbstractC6650k, SubtitleDecoderException> implements InterfaceC6647h {
    public AbstractC6645f() {
        super(new C6649j[2], new AbstractC6650k[2]);
        int i10 = this.f37628g;
        DecoderInputBuffer[] decoderInputBufferArr = this.f37626e;
        C10129a.m18992d(i10 == decoderInputBufferArr.length);
        for (DecoderInputBuffer decoderInputBuffer : decoderInputBufferArr) {
            decoderInputBuffer.m6929s(1024);
        }
    }

    @Override // p219ka.InterfaceC6647h
    /* JADX INFO: renamed from: b */
    public final void mo13278b(long j10) {
    }

    @Override // p218k9.AbstractC6638h
    /* JADX INFO: renamed from: e */
    public final SubtitleDecoderException mo13275e(DecoderInputBuffer decoderInputBuffer, AbstractC6636f abstractC6636f, boolean z10) {
        C6649j c6649j = (C6649j) decoderInputBuffer;
        AbstractC6650k abstractC6650k = (AbstractC6650k) abstractC6636f;
        try {
            ByteBuffer byteBuffer = c6649j.f12116c;
            byteBuffer.getClass();
            abstractC6650k.m13282q(c6649j.f12118e, mo13279g(byteBuffer.array(), byteBuffer.limit(), z10), c6649j.f37700i);
            abstractC6650k.f37591a &= Integer.MAX_VALUE;
            return null;
        } catch (SubtitleDecoderException e10) {
            return e10;
        }
    }

    /* JADX INFO: renamed from: g */
    public abstract InterfaceC6646g mo13279g(byte[] bArr, int i10, boolean z10) throws SubtitleDecoderException;
}
