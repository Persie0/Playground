package kotlin.reflect.jvm.internal.impl.builtins;

import cm.InterfaceC2041a;
import co.InterfaceC2076h;
import dm.C5207g;
import java.util.ServiceLoader;
import kotlin.C6740a;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.C6752c;
import p372rm.InterfaceC8863u;
import p372rm.InterfaceC8866x;
import sl.InterfaceC9070c;
import tm.InterfaceC9339a;
import tm.InterfaceC9340b;
import tm.InterfaceC9341c;

/* JADX INFO: loaded from: classes2.dex */
public interface BuiltInsLoader {

    /* JADX INFO: renamed from: a */
    public static final Companion f38313a = Companion.f38314a;

    public static final class Companion {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ Companion f38314a = new Companion();

        /* JADX INFO: renamed from: b */
        public static final InterfaceC9070c<BuiltInsLoader> f38315b = C6740a.m13373b(LazyThreadSafetyMode.PUBLICATION, new InterfaceC2041a<BuiltInsLoader>() { // from class: kotlin.reflect.jvm.internal.impl.builtins.BuiltInsLoader$Companion$Instance$2
            /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final BuiltInsLoader mo807E() {
                ServiceLoader serviceLoaderLoad = ServiceLoader.load(BuiltInsLoader.class, BuiltInsLoader.class.getClassLoader());
                C5207g.m11110e(serviceLoaderLoad, "implementations");
                BuiltInsLoader builtInsLoader = (BuiltInsLoader) C6752c.m13424R(serviceLoaderLoad);
                if (builtInsLoader != null) {
                    return builtInsLoader;
                }
                throw new IllegalStateException("No BuiltInsLoader implementation was found. Please ensure that the META-INF/services/ is not stripped from your application and that the Java virtual machine is not running under a security manager");
            }
        });
    }

    /* JADX INFO: renamed from: a */
    InterfaceC8866x mo13527a(InterfaceC2076h interfaceC2076h, InterfaceC8863u interfaceC8863u, Iterable<? extends InterfaceC9340b> iterable, InterfaceC9341c interfaceC9341c, InterfaceC9339a interfaceC9339a, boolean z10);
}
