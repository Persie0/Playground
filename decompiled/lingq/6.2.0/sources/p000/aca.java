package p000;

/* JADX INFO: loaded from: classes.dex */
public final class aca extends zba {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f497d;

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f497d) {
            case 0:
                int i = this.f71321c;
                this.f71321c = i + 2;
                Object[] objArr = this.f71319a;
                return new sp5(0, objArr[i], objArr[i + 1]);
            case 1:
                int i2 = this.f71321c;
                this.f71321c = i2 + 2;
                return this.f71319a[i2];
            default:
                int i3 = this.f71321c;
                this.f71321c = i3 + 2;
                return this.f71319a[i3 + 1];
        }
    }
}
