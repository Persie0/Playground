package p000;

import android.graphics.Matrix;
import com.airbnb.lottie.LottieAnimationView;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.net.UnknownServiceException;
import java.nio.channels.ClosedChannelException;
import javax.net.ssl.SSLException;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class el5 implements xl5 {
    @Override // p000.xl5
    public final void onResult(Object obj) {
        Throwable th = (Throwable) obj;
        el5 el5Var = LottieAnimationView.f10578L;
        Matrix matrix = fna.f39347a;
        if (!(th instanceof SocketException) && !(th instanceof ClosedChannelException) && !(th instanceof InterruptedIOException) && !(th instanceof ProtocolException) && !(th instanceof SSLException) && !(th instanceof UnknownHostException) && !(th instanceof UnknownServiceException)) {
            throw new IllegalStateException("Unable to parse composition", th);
        }
        tj5.m22152d("Unable to load composition.", th);
    }
}
