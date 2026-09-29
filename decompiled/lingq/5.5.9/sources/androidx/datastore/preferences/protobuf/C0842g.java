package androidx.datastore.preferences.protobuf;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.g */
/* JADX INFO: loaded from: classes.dex */
public final class C0842g extends ByteString.AbstractC0803a {

    /* JADX INFO: renamed from: a */
    public int f5854a = 0;

    /* JADX INFO: renamed from: b */
    public final int f5855b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ByteString f5856c;

    public C0842g(ByteString byteString) {
        this.f5856c = byteString;
        this.f5855b = byteString.size();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f5854a < this.f5855b;
    }
}
