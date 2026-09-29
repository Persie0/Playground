package p087e6;

import android.graphics.Bitmap;
import java.io.IOException;
import p007a6.C0028g;
import p332q5.InterfaceC8494a;
import p356r5.C8735e;
import p356r5.InterfaceC8736f;
import p392t5.InterfaceC9207m;
import p407u5.InterfaceC9452c;

/* JADX INFO: renamed from: e6.g */
/* JADX INFO: loaded from: classes.dex */
public final class C5378g implements InterfaceC8736f<InterfaceC8494a, Bitmap> {

    /* JADX INFO: renamed from: a */
    public final InterfaceC9452c f33791a;

    public C5378g(InterfaceC9452c interfaceC9452c) {
        this.f33791a = interfaceC9452c;
    }

    @Override // p356r5.InterfaceC8736f
    /* JADX INFO: renamed from: a */
    public final InterfaceC9207m<Bitmap> mo68a(InterfaceC8494a interfaceC8494a, int i10, int i11, C8735e c8735e) throws IOException {
        return C0028g.m155e(interfaceC8494a.mo16582b(), this.f33791a);
    }

    @Override // p356r5.InterfaceC8736f
    /* JADX INFO: renamed from: b */
    public final /* bridge */ /* synthetic */ boolean mo69b(InterfaceC8494a interfaceC8494a, C8735e c8735e) throws IOException {
        return true;
    }
}
