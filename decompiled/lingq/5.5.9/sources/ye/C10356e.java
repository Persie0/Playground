package ye;

import com.google.firebase.encoders.EncodingException;
import com.google.firebase.encoders.proto.C3217b;
import java.io.IOException;
import ve.C9712b;
import ve.InterfaceC9716f;

/* JADX INFO: renamed from: ye.e */
/* JADX INFO: loaded from: classes.dex */
public final class C10356e implements InterfaceC9716f {

    /* JADX INFO: renamed from: a */
    public boolean f52065a = false;

    /* JADX INFO: renamed from: b */
    public boolean f52066b = false;

    /* JADX INFO: renamed from: c */
    public C9712b f52067c;

    /* JADX INFO: renamed from: d */
    public final C3217b f52068d;

    public C10356e(C3217b c3217b) {
        this.f52068d = c3217b;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // ve.InterfaceC9716f
    /* JADX INFO: renamed from: e */
    public final InterfaceC9716f mo18218e(String str) throws IOException {
        if (this.f52065a) {
            throw new EncodingException("Cannot encode a second value in the ValueEncoderContext");
        }
        this.f52065a = true;
        this.f52068d.m9179e(this.f52067c, str, this.f52066b);
        return this;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // ve.InterfaceC9716f
    /* JADX INFO: renamed from: f */
    public final InterfaceC9716f mo18219f(boolean z10) throws IOException {
        if (this.f52065a) {
            throw new EncodingException("Cannot encode a second value in the ValueEncoderContext");
        }
        this.f52065a = true;
        this.f52068d.m9180f(this.f52067c, z10 ? 1 : 0, this.f52066b);
        return this;
    }
}
