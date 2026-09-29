package p219ka;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.exoplayer2.decoder.DecoderException;
import com.google.common.collect.ImmutableList;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import p479xa.C10129a;
import p479xa.C10131b;

/* JADX INFO: renamed from: ka.d */
/* JADX INFO: loaded from: classes.dex */
public final class C6643d implements InterfaceC6647h {

    /* JADX INFO: renamed from: a */
    public final C6641b f37690a = new C6641b();

    /* JADX INFO: renamed from: b */
    public final C6649j f37691b = new C6649j();

    /* JADX INFO: renamed from: c */
    public final ArrayDeque f37692c = new ArrayDeque();

    /* JADX INFO: renamed from: d */
    public int f37693d;

    /* JADX INFO: renamed from: e */
    public boolean f37694e;

    /* JADX INFO: renamed from: ka.d$a */
    public class a extends AbstractC6650k {
        public a() {
        }

        @Override // p218k9.AbstractC6636f
        /* JADX INFO: renamed from: p */
        public final void mo13274p() {
            ArrayDeque arrayDeque = C6643d.this.f37692c;
            C10129a.m18992d(arrayDeque.size() < 2);
            C10129a.m18990b(!arrayDeque.contains(this));
            this.f37591a = 0;
            this.f37701c = null;
            arrayDeque.addFirst(this);
        }
    }

    /* JADX INFO: renamed from: ka.d$b */
    public static final class b implements InterfaceC6646g {

        /* JADX INFO: renamed from: a */
        public final long f37696a;

        /* JADX INFO: renamed from: b */
        public final ImmutableList<C6640a> f37697b;

        public b(long j10, ImmutableList<C6640a> immutableList) {
            this.f37696a = j10;
            this.f37697b = immutableList;
        }

        @Override // p219ka.InterfaceC6646g
        /* JADX INFO: renamed from: a */
        public final int mo11452a(long j10) {
            return this.f37696a > j10 ? 0 : -1;
        }

        @Override // p219ka.InterfaceC6646g
        /* JADX INFO: renamed from: f */
        public final long mo11455f(int i10) {
            C10129a.m18990b(i10 == 0);
            return this.f37696a;
        }

        @Override // p219ka.InterfaceC6646g
        /* JADX INFO: renamed from: g */
        public final List<C6640a> mo11456g(long j10) {
            return j10 >= this.f37696a ? this.f37697b : ImmutableList.m9062Y();
        }

        @Override // p219ka.InterfaceC6646g
        /* JADX INFO: renamed from: i */
        public final int mo11457i() {
            return 1;
        }
    }

    public C6643d() {
        for (int i10 = 0; i10 < 2; i10++) {
            this.f37692c.addFirst(new a());
        }
        this.f37693d = 0;
    }

    @Override // p218k9.InterfaceC6634d
    /* JADX INFO: renamed from: a */
    public final void mo13271a(C6649j c6649j) throws DecoderException {
        boolean z10 = true;
        C10129a.m18992d(!this.f37694e);
        C10129a.m18992d(this.f37693d == 1);
        if (this.f37691b != c6649j) {
            z10 = false;
        }
        C10129a.m18990b(z10);
        this.f37693d = 2;
    }

    @Override // p219ka.InterfaceC6647h
    /* JADX INFO: renamed from: b */
    public final void mo13278b(long j10) {
    }

    @Override // p218k9.InterfaceC6634d
    /* JADX INFO: renamed from: c */
    public final AbstractC6650k mo13272c() throws DecoderException {
        C10129a.m18992d(!this.f37694e);
        if (this.f37693d == 2) {
            ArrayDeque arrayDeque = this.f37692c;
            if (!arrayDeque.isEmpty()) {
                AbstractC6650k abstractC6650k = (AbstractC6650k) arrayDeque.removeFirst();
                C6649j c6649j = this.f37691b;
                if (c6649j.m13269m(4)) {
                    abstractC6650k.m13268l(4);
                } else {
                    long j10 = c6649j.f12118e;
                    ByteBuffer byteBuffer = c6649j.f12116c;
                    byteBuffer.getClass();
                    byte[] bArrArray = byteBuffer.array();
                    this.f37690a.getClass();
                    Parcel parcelObtain = Parcel.obtain();
                    parcelObtain.unmarshall(bArrArray, 0, bArrArray.length);
                    parcelObtain.setDataPosition(0);
                    Bundle bundle = parcelObtain.readBundle(Bundle.class.getClassLoader());
                    parcelObtain.recycle();
                    ArrayList parcelableArrayList = bundle.getParcelableArrayList("c");
                    parcelableArrayList.getClass();
                    abstractC6650k.m13282q(c6649j.f12118e, new b(j10, C10131b.m19007a(C6640a.f37653e0, parcelableArrayList)), 0L);
                }
                c6649j.mo6927p();
                this.f37693d = 0;
                return abstractC6650k;
            }
        }
        return null;
    }

    @Override // p218k9.InterfaceC6634d
    /* JADX INFO: renamed from: d */
    public final C6649j mo13273d() throws DecoderException {
        C10129a.m18992d(!this.f37694e);
        if (this.f37693d != 0) {
            return null;
        }
        this.f37693d = 1;
        return this.f37691b;
    }

    @Override // p218k9.InterfaceC6634d
    public final void flush() {
        C10129a.m18992d(!this.f37694e);
        this.f37691b.mo6927p();
        this.f37693d = 0;
    }

    @Override // p218k9.InterfaceC6634d
    public final void release() {
        this.f37694e = true;
    }
}
