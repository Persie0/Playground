package p065d6;

import ae.C0062b;
import java.io.File;
import p392t5.InterfaceC9207m;

/* JADX INFO: renamed from: d6.b */
/* JADX INFO: loaded from: classes.dex */
public final class C5048b implements InterfaceC9207m<File> {

    /* JADX INFO: renamed from: a */
    public final File f32895a;

    public C5048b(File file) {
        C0062b.m345f0(file);
        this.f32895a = file;
    }

    @Override // p392t5.InterfaceC9207m
    /* JADX INFO: renamed from: b */
    public final /* bridge */ /* synthetic */ void mo157b() {
    }

    @Override // p392t5.InterfaceC9207m
    /* JADX INFO: renamed from: c */
    public final /* bridge */ /* synthetic */ int mo158c() {
        return 1;
    }

    @Override // p392t5.InterfaceC9207m
    /* JADX INFO: renamed from: d */
    public final Class<File> mo159d() {
        return this.f32895a.getClass();
    }

    @Override // p392t5.InterfaceC9207m
    public final File get() {
        return this.f32895a;
    }
}
