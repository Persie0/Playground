package p000;

import android.net.Uri;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class dyv {
    /* JADX INFO: renamed from: a */
    public static long m6938a(Uri uri) {
        return Long.parseLong(Uri.decode(uri.getLastPathSegment()));
    }

    /* JADX INFO: renamed from: b */
    public static mws m6939b(byte[] bArr) {
        try {
            mwn mwnVarM17090e = mws.m17090e();
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
            byteBufferWrap.order(ByteOrder.nativeOrder());
            int i = byteBufferWrap.getInt();
            for (int i2 = 0; i2 < i; i2++) {
                int i3 = byteBufferWrap.getInt();
                int i4 = byteBufferWrap.getInt();
                ArrayList arrayList = new ArrayList();
                for (int i5 = 0; i5 < i4; i5++) {
                    arrayList.add(Float.valueOf(byteBufferWrap.getFloat()));
                }
                mws mwsVarM17095j = mws.m17095j(mws.m17095j(arrayList));
                for (int i6 = 0; i6 < 6 - i4; i6++) {
                    byteBufferWrap.getFloat();
                }
                float f = byteBufferWrap.getFloat();
                if (mwsVarM17095j == null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(" toneProbabilities");
                    throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
                }
                dyt dytVar = new dyt(i3, mwsVarM17095j, f);
                lku.m15669w(dytVar.f12931b.size() == 4);
                mwnVarM17090e.m17082g(dytVar);
            }
            return mwnVarM17090e.m17081f();
        } catch (BufferUnderflowException e) {
            int i7 = mws.f41739d;
            return mzr.f41857a;
        }
    }

    /* JADX INFO: renamed from: c */
    public static long m6940c(long j) {
        return ((j + 500000) / 1000000) * 1000000;
    }

    /* JADX INFO: renamed from: d */
    public static void m6941d(dya dyaVar) {
        dyaVar.f12865a.m6886b();
    }

    /* JADX INFO: renamed from: f */
    public static fxs m6943f() {
        return new fxs(2);
    }
}
