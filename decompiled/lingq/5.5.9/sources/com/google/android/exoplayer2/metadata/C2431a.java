package com.google.android.exoplayer2.metadata;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.support.v4.media.AbstractC0140a;
import com.google.android.exoplayer2.AbstractC2406e;
import com.google.android.exoplayer2.C2413j;
import com.google.android.exoplayer2.C2416m;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import org.checkerframework.dataflow.qual.SideEffectFree;
import p150h9.InterfaceC5924l0;
import p290o6.C7968m;
import p479xa.C10129a;
import p479xa.C10134c0;
import p529z9.C10463c;
import p529z9.InterfaceC10461a;
import p529z9.InterfaceC10462b;
import p529z9.InterfaceC10464d;

/* JADX INFO: renamed from: com.google.android.exoplayer2.metadata.a */
/* JADX INFO: loaded from: classes.dex */
public final class C2431a extends AbstractC2406e implements Handler.Callback {

    /* JADX INFO: renamed from: H */
    public final InterfaceC10462b f12629H;

    /* JADX INFO: renamed from: I */
    public final InterfaceC10464d f12630I;

    /* JADX INFO: renamed from: J */
    public final Handler f12631J;

    /* JADX INFO: renamed from: K */
    public final C10463c f12632K;

    /* JADX INFO: renamed from: L */
    public InterfaceC10461a f12633L;

    /* JADX INFO: renamed from: M */
    public boolean f12634M;

    /* JADX INFO: renamed from: N */
    public boolean f12635N;

    /* JADX INFO: renamed from: O */
    public long f12636O;

    /* JADX INFO: renamed from: P */
    public Metadata f12637P;

    /* JADX INFO: renamed from: Q */
    public long f12638Q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2431a(C2413j.b bVar, Looper looper) {
        Handler handler;
        super(5);
        InterfaceC10462b.a aVar = InterfaceC10462b.f52329a;
        this.f12630I = bVar;
        if (looper == null) {
            handler = null;
        } else {
            int i10 = C10134c0.f51354a;
            handler = new Handler(looper, this);
        }
        this.f12631J = handler;
        this.f12629H = aVar;
        this.f12632K = new C10463c();
        this.f12638Q = -9223372036854775807L;
    }

    @Override // com.google.android.exoplayer2.AbstractC2406e
    /* JADX INFO: renamed from: B */
    public final void mo6864B() {
        this.f12637P = null;
        this.f12633L = null;
        this.f12638Q = -9223372036854775807L;
    }

    @Override // com.google.android.exoplayer2.AbstractC2406e
    /* JADX INFO: renamed from: D */
    public final void mo6867D(boolean z10, long j10) {
        this.f12637P = null;
        this.f12634M = false;
        this.f12635N = false;
    }

    @Override // com.google.android.exoplayer2.AbstractC2406e
    /* JADX INFO: renamed from: H */
    public final void mo6992H(C2416m[] c2416mArr, long j10, long j11) {
        this.f12633L = this.f12629H.mo19417a(c2416mArr[0]);
        Metadata metadata = this.f12637P;
        if (metadata != null) {
            long j12 = this.f12638Q;
            long j13 = metadata.f12628b;
            long j14 = (j12 + j13) - j11;
            if (j13 != j14) {
                metadata = new Metadata(j14, metadata.f12627a);
            }
            this.f12637P = metadata;
        }
        this.f12638Q = j11;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x004a  */
    /* JADX INFO: renamed from: J */
    public final void m7207J(Metadata metadata, ArrayList arrayList) {
        int i10 = 0;
        while (true) {
            Metadata.Entry[] entryArr = metadata.f12627a;
            if (i10 >= entryArr.length) {
                return;
            }
            C2416m c2416mMo7204G = entryArr[i10].mo7204G();
            if (c2416mMo7204G != null) {
                InterfaceC10462b interfaceC10462b = this.f12629H;
                if (interfaceC10462b.mo19418b(c2416mMo7204G)) {
                    AbstractC0140a abstractC0140aMo19417a = interfaceC10462b.mo19417a(c2416mMo7204G);
                    byte[] bArrMo7205h0 = entryArr[i10].mo7205h0();
                    bArrMo7205h0.getClass();
                    C10463c c10463c = this.f12632K;
                    c10463c.mo6927p();
                    c10463c.m6929s(bArrMo7205h0.length);
                    ByteBuffer byteBuffer = c10463c.f12116c;
                    int i11 = C10134c0.f51354a;
                    byteBuffer.put(bArrMo7205h0);
                    c10463c.m6930t();
                    Metadata metadataMo589a = abstractC0140aMo19417a.mo589a(c10463c);
                    if (metadataMo589a != null) {
                        m7207J(metadataMo589a, arrayList);
                    }
                } else {
                    arrayList.add(entryArr[i10]);
                }
            } else {
                arrayList.add(entryArr[i10]);
            }
            i10++;
        }
    }

    @SideEffectFree
    /* JADX INFO: renamed from: K */
    public final long m7208K(long j10) {
        boolean z10 = true;
        C10129a.m18992d(j10 != -9223372036854775807L);
        if (this.f12638Q == -9223372036854775807L) {
            z10 = false;
        }
        C10129a.m18992d(z10);
        return j10 - this.f12638Q;
    }

    @Override // com.google.android.exoplayer2.InterfaceC2536y, p150h9.InterfaceC5924l0
    /* JADX INFO: renamed from: a */
    public final String mo6875a() {
        return "MetadataRenderer";
    }

    @Override // p150h9.InterfaceC5924l0
    /* JADX INFO: renamed from: b */
    public final int mo7144b(C2416m c2416m) {
        if (this.f12629H.mo19418b(c2416m)) {
            return InterfaceC5924l0.m12343j(c2416m.f12473b0 == 0 ? 4 : 2, 0, 0);
        }
        return InterfaceC5924l0.m12343j(0, 0, 0);
    }

    @Override // com.google.android.exoplayer2.AbstractC2406e, com.google.android.exoplayer2.InterfaceC2536y
    /* JADX INFO: renamed from: d */
    public final boolean mo6877d() {
        return this.f12635N;
    }

    @Override // com.google.android.exoplayer2.InterfaceC2536y
    /* JADX INFO: renamed from: e */
    public final boolean mo6879e() {
        return true;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what != 0) {
            throw new IllegalStateException();
        }
        this.f12630I.mo7045f((Metadata) message.obj);
        return true;
    }

    @Override // com.google.android.exoplayer2.InterfaceC2536y
    /* JADX INFO: renamed from: p */
    public final void mo7151p(long j10, long j11) {
        boolean z10 = true;
        while (z10) {
            if (!this.f12634M && this.f12637P == null) {
                C10463c c10463c = this.f12632K;
                c10463c.mo6927p();
                C7968m c7968m = this.f12221b;
                c7968m.m15817e();
                int iM6993I = m6993I(c7968m, c10463c, 0);
                if (iM6993I == -4) {
                    if (c10463c.m13269m(4)) {
                        this.f12634M = true;
                    } else {
                        c10463c.f52330i = this.f12636O;
                        c10463c.m6930t();
                        InterfaceC10461a interfaceC10461a = this.f12633L;
                        int i10 = C10134c0.f51354a;
                        Metadata metadataMo589a = interfaceC10461a.mo589a(c10463c);
                        if (metadataMo589a != null) {
                            ArrayList arrayList = new ArrayList(metadataMo589a.f12627a.length);
                            m7207J(metadataMo589a, arrayList);
                            if (!arrayList.isEmpty()) {
                                this.f12637P = new Metadata(m7208K(c10463c.f12118e), (Metadata.Entry[]) arrayList.toArray(new Metadata.Entry[0]));
                            }
                        }
                    }
                } else if (iM6993I == -5) {
                    C2416m c2416m = (C2416m) c7968m.f43384b;
                    c2416m.getClass();
                    this.f12636O = c2416m.f12454K;
                }
            }
            Metadata metadata = this.f12637P;
            if (metadata == null || metadata.f12628b > m7208K(j10)) {
                z10 = false;
            } else {
                Metadata metadata2 = this.f12637P;
                Handler handler = this.f12631J;
                if (handler != null) {
                    handler.obtainMessage(0, metadata2).sendToTarget();
                } else {
                    this.f12630I.mo7045f(metadata2);
                }
                this.f12637P = null;
                z10 = true;
            }
            if (this.f12634M && this.f12637P == null) {
                this.f12635N = true;
            }
        }
    }
}
