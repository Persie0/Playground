package p000;

import java.util.RandomAccess;
import okio.ByteString;

/* JADX INFO: loaded from: classes.dex */
public final class rz6 extends AbstractC3816z0 implements RandomAccess {

    /* JADX INFO: renamed from: a */
    public final ByteString[] f60085a;

    /* JADX INFO: renamed from: b */
    public final int[] f60086b;

    public rz6(ByteString[] byteStringArr, int[] iArr) {
        this.f60085a = byteStringArr;
        this.f60086b = iArr;
    }

    @Override // p000.AbstractC3778y, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof ByteString) {
            return super.contains((ByteString) obj);
        }
        return false;
    }

    @Override // p000.AbstractC3778y
    /* JADX INFO: renamed from: d */
    public final int mo3718d() {
        return this.f60085a.length;
    }

    @Override // java.util.List
    public final Object get(int i) {
        return this.f60085a[i];
    }

    @Override // p000.AbstractC3816z0, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof ByteString) {
            return super.indexOf((ByteString) obj);
        }
        return -1;
    }

    @Override // p000.AbstractC3816z0, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof ByteString) {
            return super.lastIndexOf((ByteString) obj);
        }
        return -1;
    }
}
