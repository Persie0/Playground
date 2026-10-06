package p000;

import android.os.Binder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class jlw extends Binder {

    /* JADX INFO: renamed from: a */
    private final String f34340a;

    public jlw(String str) {
        this.f34340a = str;
    }

    @Override // android.os.Binder
    protected final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        throw new IllegalStateException(this.f34340a);
    }

    @Override // android.os.Binder, android.os.IBinder
    public final IInterface queryLocalInterface(String str) {
        return null;
    }
}
