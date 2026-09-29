package p000;

import android.graphics.Bitmap;
import android.os.BadParcelableException;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.BitmapTeleporter;
import com.google.android.gms.internal.mlkit_vision_document_scanner.zzuc;
import com.google.android.gms.internal.mlkit_vision_document_scanner.zzue;
import com.google.android.play.core.review.BinderC1076c;
import java.io.DataInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes2.dex */
public abstract class keb extends Binder implements IInterface {

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ int f47114f;

    public keb(String str) {
        this.f47114f = 0;
        attachInterface(this, str);
    }

    /* JADX INFO: renamed from: F */
    public abstract boolean mo15162F(int i, Parcel parcel, Parcel parcel2);

    @Override // android.os.IInterface
    public IBinder asBinder() {
        int i = this.f47114f;
        return this;
    }

    @Override // android.os.Binder
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        boolean zOnTransact;
        boolean zOnTransact2;
        switch (this.f47114f) {
            case 0:
                if (i <= 16777215) {
                    parcel.enforceInterface(getInterfaceDescriptor());
                } else if (super.onTransact(i, parcel, parcel2, i2)) {
                    return true;
                }
                return mo15162F(i, parcel, parcel2);
            case 1:
                if (i > 16777215) {
                    zOnTransact = super.onTransact(i, parcel, parcel2, i2);
                } else {
                    parcel.enforceInterface(getInterfaceDescriptor());
                    zOnTransact = false;
                }
                if (zOnTransact) {
                    return true;
                }
                vub vubVar = (vub) this;
                if (i != 1) {
                    return false;
                }
                int i3 = parcel.readInt();
                int i4 = fnb.f39353a;
                int iDataAvail = parcel.dataAvail();
                if (iDataAvail > 0) {
                    throw new BadParcelableException(ux5.m22988k(iDataAvail, "Parcel data not fully consumed, unread size: "));
                }
                vubVar.f65960g.m5526a(Integer.valueOf(i3));
                return true;
            case 2:
                if (i <= 16777215) {
                    parcel.enforceInterface(getInterfaceDescriptor());
                } else if (super.onTransact(i, parcel, parcel2, i2)) {
                    return true;
                }
                if (i != 1) {
                    if (i != 2) {
                        return false;
                    }
                    Parcelable.Creator<zzue> creator = zzue.CREATOR;
                    int i5 = prb.f56734a;
                    prb.m19465a(parcel);
                    parcel2.writeNoException();
                    parcel2.writeInt(0);
                    return true;
                }
                Parcelable.Creator<zzuc> creator2 = zzuc.CREATOR;
                int i6 = prb.f56734a;
                zzuc zzucVarCreateFromParcel = parcel.readInt() != 0 ? creator2.createFromParcel(parcel) : null;
                prb.m19465a(parcel);
                BitmapTeleporter bitmapTeleporter = ((zzuc) zzucVarCreateFromParcel).f12009a;
                if (bitmapTeleporter.f11681e) {
                    return true;
                }
                ParcelFileDescriptor parcelFileDescriptor = bitmapTeleporter.f11678b;
                lda.m16130p(parcelFileDescriptor);
                DataInputStream dataInputStream = new DataInputStream(new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor));
                try {
                    try {
                        byte[] bArr = new byte[dataInputStream.readInt()];
                        int i7 = dataInputStream.readInt();
                        int i8 = dataInputStream.readInt();
                        Bitmap.Config configValueOf = Bitmap.Config.valueOf(dataInputStream.readUTF());
                        dataInputStream.read(bArr);
                        try {
                            dataInputStream.close();
                            break;
                        } catch (IOException e) {
                            Log.w("BitmapTeleporter", "Could not close stream", e);
                        }
                        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
                        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i7, i8, configValueOf);
                        bitmapCreateBitmap.copyPixelsFromBuffer(byteBufferWrap);
                        bitmapTeleporter.f11680d = bitmapCreateBitmap;
                        bitmapTeleporter.f11681e = true;
                        return true;
                    } catch (IOException e2) {
                        throw new IllegalStateException("Could not read from parcel file descriptor", e2);
                    }
                } catch (Throwable th) {
                    try {
                        dataInputStream.close();
                        break;
                    } catch (IOException e3) {
                        Log.w("BitmapTeleporter", "Could not close stream", e3);
                    }
                    throw th;
                }
            case 3:
            default:
                return super.onTransact(i, parcel, parcel2, i2);
            case 4:
                if (i <= 16777215) {
                    parcel.enforceInterface(getInterfaceDescriptor());
                } else if (super.onTransact(i, parcel, parcel2, i2)) {
                    return true;
                }
                BinderC1076c binderC1076c = (BinderC1076c) this;
                if (i != 2) {
                    return false;
                }
                Parcelable.Creator creator3 = Bundle.CREATOR;
                int i9 = trb.f62789a;
                Bundle bundle = (Bundle) (parcel.readInt() != 0 ? (Parcelable) creator3.createFromParcel(parcel) : null);
                int iDataAvail2 = parcel.dataAvail();
                if (iDataAvail2 > 0) {
                    throw new BadParcelableException(ux5.m22988k(iDataAvail2, "Parcel data not fully consumed, unread size: "));
                }
                binderC1076c.m6257u(bundle);
                return true;
            case 5:
                if (i > 16777215) {
                    zOnTransact2 = super.onTransact(i, parcel, parcel2, i2);
                } else {
                    parcel.enforceInterface(getInterfaceDescriptor());
                    zOnTransact2 = false;
                }
                if (zOnTransact2) {
                    return true;
                }
                vic vicVar = (vic) this;
                switch (i) {
                    case 1:
                        vicVar.f65426g.m5286e((Status) yrb.m25305a(parcel, Status.CREATOR));
                        return true;
                    case 2:
                        ij6.m13946b();
                        break;
                    case 3:
                        parcel.readLong();
                        ij6.m13946b();
                        break;
                    case 4:
                        ij6.m13946b();
                        break;
                    case 5:
                        parcel.readLong();
                        ij6.m13946b();
                        break;
                    case 6:
                        ij6.m13946b();
                        break;
                    case 7:
                        ij6.m13946b();
                        break;
                    case 8:
                        ij6.m13946b();
                        break;
                    case 9:
                        ij6.m13946b();
                        break;
                }
                return false;
        }
    }
}
