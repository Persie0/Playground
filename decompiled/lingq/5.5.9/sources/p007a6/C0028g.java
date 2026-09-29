package p007a6;

import ae.C0062b;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import com.android.installreferrer.api.InstallReferrerClient;
import p258m6.C7492l;
import p392t5.InterfaceC9204j;
import p392t5.InterfaceC9207m;
import p407u5.InterfaceC9452c;

/* JADX INFO: renamed from: a6.g */
/* JADX INFO: loaded from: classes.dex */
public final class C0028g implements InterfaceC9207m, InterfaceC9204j {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f22a = 1;

    /* JADX INFO: renamed from: b */
    public final Object f23b;

    /* JADX INFO: renamed from: c */
    public final Object f24c;

    public C0028g(Resources resources, InterfaceC9207m interfaceC9207m) {
        C0062b.m345f0(resources);
        this.f23b = resources;
        C0062b.m345f0(interfaceC9207m);
        this.f24c = interfaceC9207m;
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    public C0028g(Bitmap bitmap, InterfaceC9452c interfaceC9452c) {
        if (bitmap == null) {
            throw new NullPointerException("Bitmap must not be null");
        }
        this.f23b = bitmap;
        if (interfaceC9452c == null) {
            throw new NullPointerException("BitmapPool must not be null");
        }
        this.f24c = interfaceC9452c;
    }

    /* JADX INFO: renamed from: e */
    public static C0028g m155e(Bitmap bitmap, InterfaceC9452c interfaceC9452c) {
        if (bitmap == null) {
            return null;
        }
        return new C0028g(bitmap, interfaceC9452c);
    }

    @Override // p392t5.InterfaceC9204j
    /* JADX INFO: renamed from: a */
    public final void mo156a() {
        switch (this.f22a) {
            case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                ((Bitmap) this.f23b).prepareToDraw();
                break;
            default:
                InterfaceC9207m interfaceC9207m = (InterfaceC9207m) this.f24c;
                if (interfaceC9207m instanceof InterfaceC9204j) {
                    ((InterfaceC9204j) interfaceC9207m).mo156a();
                }
                break;
        }
    }

    @Override // p392t5.InterfaceC9207m
    /* JADX INFO: renamed from: b */
    public final void mo157b() {
        int i10 = this.f22a;
        Object obj = this.f24c;
        switch (i10) {
            case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                ((InterfaceC9452c) obj).mo164d((Bitmap) this.f23b);
                break;
            default:
                ((InterfaceC9207m) obj).mo157b();
                break;
        }
    }

    @Override // p392t5.InterfaceC9207m
    /* JADX INFO: renamed from: c */
    public final int mo158c() {
        switch (this.f22a) {
            case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                return C7492l.m14882c((Bitmap) this.f23b);
            default:
                return ((InterfaceC9207m) this.f24c).mo158c();
        }
    }

    @Override // p392t5.InterfaceC9207m
    /* JADX INFO: renamed from: d */
    public final Class mo159d() {
        switch (this.f22a) {
            case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                return Bitmap.class;
            default:
                return BitmapDrawable.class;
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // p392t5.InterfaceC9207m
    public final Object get() {
        int i10 = this.f22a;
        Object obj = this.f23b;
        switch (i10) {
            case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                return (Bitmap) obj;
            default:
                return new BitmapDrawable((Resources) obj, (Bitmap) ((InterfaceC9207m) this.f24c).get());
        }
    }
}
