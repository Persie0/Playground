package p483xe;

import com.android.installreferrer.api.InstallReferrerClient;
import com.google.firebase.encoders.EncodingException;
import com.google.firebase.encoders.proto.C3217b;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Map;
import ve.InterfaceC9713c;
import ve.InterfaceC9714d;

/* JADX INFO: renamed from: xe.a */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C10178a implements InterfaceC9713c {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f51497a;

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    @Override // ve.InterfaceC9711a
    /* JADX INFO: renamed from: a */
    public final void mo6757a(Object obj, InterfaceC9714d interfaceC9714d) throws IOException {
        switch (this.f51497a) {
            case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                throw new EncodingException("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
            default:
                Map.Entry entry = (Map.Entry) obj;
                InterfaceC9714d interfaceC9714d2 = interfaceC9714d;
                Charset charset = C3217b.f16237f;
                interfaceC9714d2.mo9178d(C3217b.f16238g, entry.getKey());
                interfaceC9714d2.mo9178d(C3217b.f16239h, entry.getValue());
                return;
        }
    }
}
