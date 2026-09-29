package p000;

import androidx.glance.appwidget.protobuf.ByteString;
import com.google.android.gms.internal.clearcut.zzbb;
import com.google.android.gms.internal.measurement.zzacr;
import com.google.android.gms.internal.play_billing.zzev;
import com.google.android.gms.internal.vision.zzht;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class vk0 implements Iterator {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f65524a = 2;

    /* JADX INFO: renamed from: b */
    public int f65525b = 0;

    /* JADX INFO: renamed from: c */
    public final int f65526c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Object f65527d;

    public vk0(zzbb zzbbVar) {
        this.f65527d = zzbbVar;
        this.f65526c = zzbbVar.size();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f65524a) {
            case 0:
                return this.f65525b < this.f65526c;
            case 1:
                return this.f65525b < this.f65526c;
            case 2:
                return this.f65525b < this.f65526c;
            case 3:
                return this.f65525b < this.f65526c;
            case 4:
                return this.f65525b < this.f65526c;
            case 5:
                return this.f65525b < this.f65526c;
            default:
                return this.f65525b < this.f65526c;
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.f65524a;
        int i2 = this.f65526c;
        Object obj = this.f65527d;
        switch (i) {
            case 0:
                return Byte.valueOf(nextByte());
            case 1:
                return Byte.valueOf(nextByte());
            case 2:
                int i3 = this.f65525b;
                if (i3 < i2) {
                    this.f65525b = i3 + 1;
                    return Byte.valueOf(((ByteString) obj).mo2264i(i3));
                }
                uk9.m22784s();
                return null;
            case 3:
                int i4 = this.f65525b;
                if (i4 < i2) {
                    this.f65525b = i4 + 1;
                    return Byte.valueOf(((zzacr) obj).mo5421d(i4));
                }
                uk9.m22784s();
                return null;
            case 4:
                try {
                    int i5 = this.f65525b;
                    this.f65525b = i5 + 1;
                    return Byte.valueOf(((zzbb) obj).mo5343f(i5));
                } catch (IndexOutOfBoundsException e) {
                    uk9.m22775i(e.getMessage());
                    return null;
                }
            case 5:
                int i6 = this.f65525b;
                if (i6 < i2) {
                    this.f65525b = i6 + 1;
                    return Byte.valueOf(((zzev) obj).mo5679f(i6));
                }
                uk9.m22784s();
                return null;
            default:
                int i7 = this.f65525b;
                if (i7 < i2) {
                    this.f65525b = i7 + 1;
                    return Byte.valueOf(((zzht) obj).mo5833h(i7));
                }
                uk9.m22784s();
                return null;
        }
    }

    public byte nextByte() {
        switch (this.f65524a) {
            case 0:
                int i = this.f65525b;
                if (i < this.f65526c) {
                    this.f65525b = i + 1;
                    return ((com.google.crypto.tink.shaded.protobuf.ByteString) this.f65527d).mo6411i(i);
                }
                uk9.m22784s();
                return (byte) 0;
            default:
                int i2 = this.f65525b;
                if (i2 < this.f65526c) {
                    this.f65525b = i2 + 1;
                    return ((com.google.protobuf.ByteString) this.f65527d).mo6783g(i2);
                }
                uk9.m22784s();
                return (byte) 0;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f65524a) {
            case 0:
                throw new UnsupportedOperationException();
            case 1:
                throw new UnsupportedOperationException();
            case 2:
                throw new UnsupportedOperationException();
            case 3:
                throw new UnsupportedOperationException();
            case 4:
                throw new UnsupportedOperationException();
            case 5:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    public vk0(zzacr zzacrVar) {
        this.f65527d = zzacrVar;
        this.f65526c = zzacrVar.mo5422f();
    }

    public vk0(zzev zzevVar) {
        this.f65527d = zzevVar;
        this.f65526c = zzevVar.mo5681h();
    }

    public vk0(zzht zzhtVar) {
        this.f65527d = zzhtVar;
        this.f65526c = zzhtVar.mo5832f();
    }

    public vk0(com.google.protobuf.ByteString byteString) {
        this.f65527d = byteString;
        this.f65526c = byteString.size();
    }

    public vk0(ByteString byteString) {
        this.f65527d = byteString;
        this.f65526c = byteString.size();
    }

    public vk0(com.google.crypto.tink.shaded.protobuf.ByteString byteString) {
        this.f65527d = byteString;
        this.f65526c = byteString.size();
    }
}
