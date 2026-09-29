package p420um;

import co.InterfaceC2076h;
import dm.C5207g;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.C6829c;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.LazyPackageViewDescriptorImpl;
import mn.C7646c;
import p080e.C5288t;

/* JADX INFO: renamed from: um.b0 */
/* JADX INFO: loaded from: classes2.dex */
public interface InterfaceC9558b0 {

    /* JADX INFO: renamed from: a */
    public static final a f49140a = a.f49141a;

    /* JADX INFO: renamed from: um.b0$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ a f49141a = new a();

        /* JADX INFO: renamed from: b */
        public static final C5288t f49142b = new C5288t("PackageViewDescriptorFactory");
    }

    /* JADX INFO: renamed from: um.b0$b */
    public static final class b implements InterfaceC9558b0 {

        /* JADX INFO: renamed from: b */
        public static final b f49143b = new b();

        @Override // p420um.InterfaceC9558b0
        /* JADX INFO: renamed from: a */
        public final LazyPackageViewDescriptorImpl mo18001a(C6829c c6829c, C7646c c7646c, InterfaceC2076h interfaceC2076h) {
            C5207g.m11111f(c6829c, "module");
            C5207g.m11111f(c7646c, "fqName");
            C5207g.m11111f(interfaceC2076h, "storageManager");
            return new LazyPackageViewDescriptorImpl(c6829c, c7646c, interfaceC2076h);
        }
    }

    /* JADX INFO: renamed from: a */
    LazyPackageViewDescriptorImpl mo18001a(C6829c c6829c, C7646c c7646c, InterfaceC2076h interfaceC2076h);
}
