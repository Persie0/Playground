package kotlin.reflect.jvm.internal.impl.storage;

import androidx.datastore.preferences.PreferencesProto$Value;
import cm.InterfaceC2041a;
import cm.InterfaceC2052l;
import co.C2070b;
import co.InterfaceC2069a;
import co.InterfaceC2071c;
import co.InterfaceC2072d;
import co.InterfaceC2073e;
import co.InterfaceC2074f;
import co.InterfaceC2075g;
import co.InterfaceC2076h;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import kotlin.collections.EmptyList;
import kotlin.reflect.jvm.internal.impl.utils.WrappedValues;
import kotlin.text.C7076b;
import om.C8089f;
import p003a2.C0009a;
import p260m8.C7499b;
import p290o6.C7968m;

/* JADX INFO: loaded from: classes2.dex */
public class LockBasedStorageManager implements InterfaceC2076h {

    /* JADX INFO: renamed from: d */
    public static final String f39827d = C7076b.m14276A3(LockBasedStorageManager.class.getCanonicalName(), "");

    /* JADX INFO: renamed from: e */
    public static final C7035a f39828e = new C7035a();

    /* JADX INFO: renamed from: a */
    public final InterfaceC2075g f39829a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC7038d f39830b;

    /* JADX INFO: renamed from: c */
    public final String f39831c;

    public enum NotValue {
        NOT_COMPUTED,
        COMPUTING,
        RECURSION_WAS_DETECTED
    }

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager$a */
    public static class C7035a extends LockBasedStorageManager {
        public C7035a() {
            super("NO_LOCKS", C7499b.f41427b);
        }

        @Override // kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager
        /* JADX INFO: renamed from: k */
        public final C7046l mo14160k(Object obj, String str) {
            return new C7046l(null, true);
        }
    }

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager$b */
    public static class C7036b<K, V> extends C7037c<K, V> implements InterfaceC2069a<K, V> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C7036b(LockBasedStorageManager lockBasedStorageManager, ConcurrentHashMap concurrentHashMap) {
            super(lockBasedStorageManager, concurrentHashMap);
            if (lockBasedStorageManager != null) {
            } else {
                m14161a(0);
                throw null;
            }
        }

        /* JADX INFO: renamed from: a */
        public static /* synthetic */ void m14161a(int i10) {
            String str = i10 != 3 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
            Object[] objArr = new Object[i10 != 3 ? 3 : 2];
            if (i10 == 1) {
                objArr[0] = "map";
            } else if (i10 == 2) {
                objArr[0] = "computation";
            } else if (i10 != 3) {
                objArr[0] = "storageManager";
            } else {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$CacheWithNotNullValuesBasedOnMemoizedFunction";
            }
            if (i10 != 3) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$CacheWithNotNullValuesBasedOnMemoizedFunction";
            } else {
                objArr[1] = "computeIfAbsent";
            }
            if (i10 == 2) {
                objArr[2] = "computeIfAbsent";
            } else if (i10 != 3) {
                objArr[2] = "<init>";
            }
            String str2 = String.format(str, objArr);
            if (i10 == 3) {
                throw new IllegalStateException(str2);
            }
        }

        /* JADX INFO: renamed from: d */
        public final V m14162d(K k10, InterfaceC2041a<? extends V> interfaceC2041a) throws Throwable {
            V vMo528n = mo528n(new C7039e(k10, interfaceC2041a));
            if (vMo528n != null) {
                return vMo528n;
            }
            m14161a(3);
            throw null;
        }
    }

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager$c */
    public static class C7037c<K, V> extends C7044j<C7039e<K, V>, V> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C7037c(LockBasedStorageManager lockBasedStorageManager, ConcurrentHashMap concurrentHashMap) {
            super(lockBasedStorageManager, concurrentHashMap, new C7049c());
            if (lockBasedStorageManager != null) {
            } else {
                m14163a(0);
                throw null;
            }
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        /* JADX INFO: renamed from: a */
        public static /* synthetic */ void m14163a(int i10) {
            Object[] objArr = new Object[3];
            if (i10 == 1) {
                objArr[0] = "map";
            } else if (i10 != 2) {
                objArr[0] = "storageManager";
            } else {
                objArr[0] = "computation";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$CacheWithNullableValuesBasedOnMemoizedFunction";
            if (i10 != 2) {
                objArr[2] = "<init>";
            } else {
                objArr[2] = "computeIfAbsent";
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }
    }

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager$d */
    public interface InterfaceC7038d {

        /* JADX INFO: renamed from: a */
        public static final a f39832a = new a();

        /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager$d$a */
        public static class a implements InterfaceC7038d {
        }
    }

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager$e */
    public static class C7039e<K, V> {

        /* JADX INFO: renamed from: a */
        public final K f39833a;

        /* JADX INFO: renamed from: b */
        public final InterfaceC2041a<? extends V> f39834b;

        public C7039e(K k10, InterfaceC2041a<? extends V> interfaceC2041a) {
            this.f39833a = k10;
            this.f39834b = interfaceC2041a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return obj != null && C7039e.class == obj.getClass() && this.f39833a.equals(((C7039e) obj).f39833a);
        }

        public final int hashCode() {
            return this.f39833a.hashCode();
        }
    }

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager$f */
    public static class C7040f<T> implements InterfaceC2074f<T> {

        /* JADX INFO: renamed from: a */
        public final LockBasedStorageManager f39835a;

        /* JADX INFO: renamed from: b */
        public final InterfaceC2041a<? extends T> f39836b;

        /* JADX INFO: renamed from: c */
        public volatile Object f39837c;

        /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
        public C7040f(LockBasedStorageManager lockBasedStorageManager, InterfaceC2041a<? extends T> interfaceC2041a) {
            if (lockBasedStorageManager == null) {
                m14164a(0);
                throw null;
            }
            if (interfaceC2041a == null) {
                m14164a(1);
                throw null;
            }
            this.f39837c = NotValue.NOT_COMPUTED;
            this.f39835a = lockBasedStorageManager;
            this.f39836b = interfaceC2041a;
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        /* JADX INFO: renamed from: a */
        public static /* synthetic */ void m14164a(int i10) {
            String str = (i10 == 2 || i10 == 3) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            Object[] objArr = new Object[(i10 == 2 || i10 == 3) ? 2 : 3];
            if (i10 == 1) {
                objArr[0] = "computable";
            } else if (i10 == 2 || i10 == 3) {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedLazyValue";
            } else {
                objArr[0] = "storageManager";
            }
            if (i10 == 2) {
                objArr[1] = "recursionDetected";
            } else if (i10 != 3) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedLazyValue";
            } else {
                objArr[1] = "renderDebugInformation";
            }
            if (i10 != 2 && i10 != 3) {
                objArr[2] = "<init>";
            }
            String str2 = String.format(str, objArr);
            if (i10 != 2 && i10 != 3) {
                throw new IllegalArgumentException(str2);
            }
            throw new IllegalStateException(str2);
        }

        /* JADX WARN: Code duplicated, block: B:15:0x0039 A[Catch: all -> 0x0093, TryCatch #0 {all -> 0x0093, blocks: (B:7:0x0013, B:9:0x001b, B:10:0x0020, B:12:0x0024, B:14:0x0035, B:15:0x0039, B:17:0x003e, B:19:0x0049, B:20:0x004d, B:25:0x0066, B:27:0x006e, B:29:0x0075, B:30:0x007e, B:31:0x0088, B:32:0x0089, B:33:0x0092, B:21:0x004f), top: B:37:0x0013, inners: #1 }] */
        /* JADX WARN: Code duplicated, block: B:17:0x003e A[Catch: all -> 0x0093, TryCatch #0 {all -> 0x0093, blocks: (B:7:0x0013, B:9:0x001b, B:10:0x0020, B:12:0x0024, B:14:0x0035, B:15:0x0039, B:17:0x003e, B:19:0x0049, B:20:0x004d, B:25:0x0066, B:27:0x006e, B:29:0x0075, B:30:0x007e, B:31:0x0088, B:32:0x0089, B:33:0x0092, B:21:0x004f), top: B:37:0x0013, inners: #1 }] */
        /* JADX WARN: Code duplicated, block: B:19:0x0049 A[Catch: all -> 0x0093, TryCatch #0 {all -> 0x0093, blocks: (B:7:0x0013, B:9:0x001b, B:10:0x0020, B:12:0x0024, B:14:0x0035, B:15:0x0039, B:17:0x003e, B:19:0x0049, B:20:0x004d, B:25:0x0066, B:27:0x006e, B:29:0x0075, B:30:0x007e, B:31:0x0088, B:32:0x0089, B:33:0x0092, B:21:0x004f), top: B:37:0x0013, inners: #1 }] */
        /* JADX WARN: Code duplicated, block: B:20:0x004d A[Catch: all -> 0x0093, TRY_LEAVE, TryCatch #0 {all -> 0x0093, blocks: (B:7:0x0013, B:9:0x001b, B:10:0x0020, B:12:0x0024, B:14:0x0035, B:15:0x0039, B:17:0x003e, B:19:0x0049, B:20:0x004d, B:25:0x0066, B:27:0x006e, B:29:0x0075, B:30:0x007e, B:31:0x0088, B:32:0x0089, B:33:0x0092, B:21:0x004f), top: B:37:0x0013, inners: #1 }] */
        @Override // cm.InterfaceC2041a
        /* JADX INFO: renamed from: E */
        public T mo807E() throws Throwable {
            C7046l<T> c7046lMo14167d;
            T t10 = (T) this.f39837c;
            if (!(t10 instanceof NotValue)) {
                WrappedValues.m14244a(t10);
                return t10;
            }
            this.f39835a.f39829a.lock();
            try {
                T tMo807E = (T) this.f39837c;
                if (tMo807E instanceof NotValue) {
                    NotValue notValue = NotValue.COMPUTING;
                    if (tMo807E == notValue) {
                        this.f39837c = NotValue.RECURSION_WAS_DETECTED;
                        C7046l<T> c7046lMo14167d2 = mo14167d(true);
                        if (!c7046lMo14167d2.f39843b) {
                            tMo807E = c7046lMo14167d2.f39842a;
                        } else if (tMo807E == NotValue.RECURSION_WAS_DETECTED) {
                            c7046lMo14167d = mo14167d(false);
                            if (c7046lMo14167d.f39843b) {
                                this.f39837c = notValue;
                                try {
                                    tMo807E = this.f39836b.mo807E();
                                    mo14166c(tMo807E);
                                    this.f39837c = tMo807E;
                                } catch (Throwable th2) {
                                    if (C7499b.m14928Z(th2)) {
                                        this.f39837c = NotValue.NOT_COMPUTED;
                                        throw th2;
                                    }
                                    if (this.f39837c == NotValue.COMPUTING) {
                                        this.f39837c = new WrappedValues.C7070b(th2);
                                    }
                                    ((InterfaceC7038d.a) this.f39835a.f39830b).getClass();
                                    throw th2;
                                }
                            } else {
                                tMo807E = c7046lMo14167d.f39842a;
                            }
                        } else {
                            this.f39837c = notValue;
                            tMo807E = this.f39836b.mo807E();
                            mo14166c(tMo807E);
                            this.f39837c = tMo807E;
                        }
                    } else if (tMo807E == NotValue.RECURSION_WAS_DETECTED) {
                        c7046lMo14167d = mo14167d(false);
                        if (c7046lMo14167d.f39843b) {
                            tMo807E = c7046lMo14167d.f39842a;
                        } else {
                            this.f39837c = notValue;
                            tMo807E = this.f39836b.mo807E();
                            mo14166c(tMo807E);
                            this.f39837c = tMo807E;
                        }
                    } else {
                        this.f39837c = notValue;
                        tMo807E = this.f39836b.mo807E();
                        mo14166c(tMo807E);
                        this.f39837c = tMo807E;
                    }
                } else {
                    WrappedValues.m14244a(tMo807E);
                }
                this.f39835a.f39829a.unlock();
                return tMo807E;
            } catch (Throwable th3) {
                this.f39835a.f39829a.unlock();
                throw th3;
            }
        }

        /* JADX INFO: renamed from: b */
        public final boolean m14165b() {
            return (this.f39837c == NotValue.NOT_COMPUTED || this.f39837c == NotValue.COMPUTING) ? false : true;
        }

        /* JADX INFO: renamed from: c */
        public void mo14166c(T t10) {
        }

        /* JADX INFO: renamed from: d */
        public C7046l<T> mo14167d(boolean z10) {
            C7046l<T> c7046lMo14160k = this.f39835a.mo14160k(null, "in a lazy value");
            if (c7046lMo14160k != null) {
                return c7046lMo14160k;
            }
            m14164a(2);
            throw null;
        }
    }

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager$g */
    public static abstract class AbstractC7041g<T> extends C7040f<T> {

        /* JADX INFO: renamed from: d */
        public volatile C7968m f39838d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AbstractC7041g(LockBasedStorageManager lockBasedStorageManager, InterfaceC2041a<? extends T> interfaceC2041a) {
            super(lockBasedStorageManager, interfaceC2041a);
            if (lockBasedStorageManager == null) {
                m14168a(0);
                throw null;
            }
            this.f39838d = null;
        }

        /* JADX INFO: renamed from: a */
        public static /* synthetic */ void m14168a(int i10) {
            Object[] objArr = new Object[3];
            if (i10 != 1) {
                objArr[0] = "storageManager";
            } else {
                objArr[0] = "computable";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedLazyValueWithPostCompute";
            objArr[2] = "<init>";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.C7040f, cm.InterfaceC2041a
        /* JADX INFO: renamed from: E */
        public T mo807E() {
            C7968m c7968m = this.f39838d;
            if (c7968m != null) {
                boolean z10 = true;
                if (((Thread) c7968m.f43384b) == Thread.currentThread()) {
                    if (((Thread) c7968m.f43384b) != Thread.currentThread()) {
                        z10 = false;
                    }
                    if (z10) {
                        return (T) c7968m.f43383a;
                    }
                    throw new IllegalStateException("No value in this thread (hasValue should be checked before)");
                }
            }
            return (T) super.mo807E();
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.C7040f
        /* JADX INFO: renamed from: c */
        public final void mo14166c(T t10) {
            this.f39838d = new C7968m(t10);
            try {
                C7048b c7048b = (C7048b) this;
                if (t10 == null) {
                    C7048b.m14175a(2);
                    throw null;
                }
                c7048b.f39846f.mo528n(t10);
                this.f39838d = null;
            } catch (Throwable th2) {
                this.f39838d = null;
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager$h */
    public static class C7042h<T> extends C7040f<T> implements InterfaceC2073e<T> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        public C7042h(LockBasedStorageManager lockBasedStorageManager, InterfaceC2041a<? extends T> interfaceC2041a) {
            super(lockBasedStorageManager, interfaceC2041a);
            if (lockBasedStorageManager == null) {
                m14169a(0);
                throw null;
            }
            if (interfaceC2041a != null) {
            } else {
                m14169a(1);
                throw null;
            }
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        /* JADX INFO: renamed from: a */
        public static /* synthetic */ void m14169a(int i10) {
            String str = i10 != 2 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
            Object[] objArr = new Object[i10 != 2 ? 3 : 2];
            if (i10 == 1) {
                objArr[0] = "computable";
            } else if (i10 != 2) {
                objArr[0] = "storageManager";
            } else {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedNotNullLazyValue";
            }
            if (i10 != 2) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedNotNullLazyValue";
            } else {
                objArr[1] = "invoke";
            }
            if (i10 != 2) {
                objArr[2] = "<init>";
            }
            String str2 = String.format(str, objArr);
            if (i10 == 2) {
                throw new IllegalStateException(str2);
            }
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.C7040f, cm.InterfaceC2041a
        /* JADX INFO: renamed from: E */
        public final T mo807E() {
            T t10 = (T) super.mo807E();
            if (t10 != null) {
                return t10;
            }
            m14169a(2);
            throw null;
        }
    }

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager$i */
    public static abstract class AbstractC7043i<T> extends AbstractC7041g<T> implements InterfaceC2073e<T> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AbstractC7043i(LockBasedStorageManager lockBasedStorageManager, InterfaceC2041a<? extends T> interfaceC2041a) {
            super(lockBasedStorageManager, interfaceC2041a);
            if (lockBasedStorageManager != null) {
            } else {
                m14170a(0);
                throw null;
            }
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        /* JADX INFO: renamed from: a */
        public static /* synthetic */ void m14170a(int i10) {
            String str = i10 != 2 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
            Object[] objArr = new Object[i10 != 2 ? 3 : 2];
            if (i10 == 1) {
                objArr[0] = "computable";
            } else if (i10 != 2) {
                objArr[0] = "storageManager";
            } else {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedNotNullLazyValueWithPostCompute";
            }
            if (i10 != 2) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedNotNullLazyValueWithPostCompute";
            } else {
                objArr[1] = "invoke";
            }
            if (i10 != 2) {
                objArr[2] = "<init>";
            }
            String str2 = String.format(str, objArr);
            if (i10 == 2) {
                throw new IllegalStateException(str2);
            }
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.AbstractC7041g, kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.C7040f, cm.InterfaceC2041a
        /* JADX INFO: renamed from: E */
        public final T mo807E() {
            T t10 = (T) super.mo807E();
            if (t10 != null) {
                return t10;
            }
            m14170a(2);
            throw null;
        }
    }

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager$j */
    public static class C7044j<K, V> implements InterfaceC2072d<K, V> {

        /* JADX INFO: renamed from: a */
        public final LockBasedStorageManager f39839a;

        /* JADX INFO: renamed from: b */
        public final ConcurrentMap<K, Object> f39840b;

        /* JADX INFO: renamed from: c */
        public final InterfaceC2052l<? super K, ? extends V> f39841c;

        public C7044j(LockBasedStorageManager lockBasedStorageManager, ConcurrentHashMap concurrentHashMap, InterfaceC2052l interfaceC2052l) {
            if (lockBasedStorageManager == null) {
                m14171a(0);
                throw null;
            }
            this.f39839a = lockBasedStorageManager;
            this.f39840b = concurrentHashMap;
            this.f39841c = interfaceC2052l;
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        /* JADX INFO: renamed from: a */
        public static /* synthetic */ void m14171a(int i10) {
            String str = (i10 == 3 || i10 == 4) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            Object[] objArr = new Object[(i10 == 3 || i10 == 4) ? 2 : 3];
            if (i10 == 1) {
                objArr[0] = "map";
            } else if (i10 == 2) {
                objArr[0] = "compute";
            } else if (i10 == 3 || i10 == 4) {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$MapBasedMemoizedFunction";
            } else {
                objArr[0] = "storageManager";
            }
            if (i10 == 3) {
                objArr[1] = "recursionDetected";
            } else if (i10 != 4) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$MapBasedMemoizedFunction";
            } else {
                objArr[1] = "raceCondition";
            }
            if (i10 != 3 && i10 != 4) {
                objArr[2] = "<init>";
            }
            String str2 = String.format(str, objArr);
            if (i10 != 3 && i10 != 4) {
                throw new IllegalArgumentException(str2);
            }
            throw new IllegalStateException(str2);
        }

        /* JADX INFO: renamed from: b */
        public final boolean m14172b(K k10) {
            Object obj = this.f39840b.get(k10);
            return (obj == null || obj == NotValue.COMPUTING) ? false : true;
        }

        /* JADX INFO: renamed from: c */
        public final AssertionError m14173c(K k10, Object obj) {
            AssertionError assertionError = new AssertionError("Race condition detected on input " + k10 + ". Old value is " + obj + " under " + this.f39839a);
            LockBasedStorageManager.m14158l(assertionError);
            return assertionError;
        }

        /* JADX WARN: Code duplicated, block: B:22:0x004e A[Catch: all -> 0x00d0, PHI: r4
          0x004e: PHI (r4v2 java.lang.Object) = (r4v1 java.lang.Object), (r4v6 java.lang.Object) binds: [B:13:0x0033, B:17:0x0042] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {all -> 0x00d0, blocks: (B:11:0x0027, B:14:0x0035, B:16:0x0040, B:18:0x0044, B:19:0x0048, B:20:0x004c, B:22:0x004e, B:24:0x0053, B:26:0x0059, B:28:0x005f, B:29:0x0064, B:30:0x0069, B:32:0x006c, B:50:0x009b, B:54:0x00a6, B:56:0x00b4, B:57:0x00b9, B:59:0x00bb, B:60:0x00c0, B:61:0x00c1, B:62:0x00c7, B:63:0x00c8, B:64:0x00cf, B:39:0x007a, B:43:0x0089, B:47:0x0093, B:48:0x0099), top: B:69:0x0027, inners: #1 }] */
        /* JADX WARN: Code duplicated, block: B:24:0x0053 A[Catch: all -> 0x00d0, TryCatch #0 {all -> 0x00d0, blocks: (B:11:0x0027, B:14:0x0035, B:16:0x0040, B:18:0x0044, B:19:0x0048, B:20:0x004c, B:22:0x004e, B:24:0x0053, B:26:0x0059, B:28:0x005f, B:29:0x0064, B:30:0x0069, B:32:0x006c, B:50:0x009b, B:54:0x00a6, B:56:0x00b4, B:57:0x00b9, B:59:0x00bb, B:60:0x00c0, B:61:0x00c1, B:62:0x00c7, B:63:0x00c8, B:64:0x00cf, B:39:0x007a, B:43:0x0089, B:47:0x0093, B:48:0x0099), top: B:69:0x0027, inners: #1 }] */
        /* JADX WARN: Code duplicated, block: B:26:0x0059 A[Catch: all -> 0x00d0, TryCatch #0 {all -> 0x00d0, blocks: (B:11:0x0027, B:14:0x0035, B:16:0x0040, B:18:0x0044, B:19:0x0048, B:20:0x004c, B:22:0x004e, B:24:0x0053, B:26:0x0059, B:28:0x005f, B:29:0x0064, B:30:0x0069, B:32:0x006c, B:50:0x009b, B:54:0x00a6, B:56:0x00b4, B:57:0x00b9, B:59:0x00bb, B:60:0x00c0, B:61:0x00c1, B:62:0x00c7, B:63:0x00c8, B:64:0x00cf, B:39:0x007a, B:43:0x0089, B:47:0x0093, B:48:0x0099), top: B:69:0x0027, inners: #1 }] */
        /* JADX WARN: Code duplicated, block: B:28:0x005f A[Catch: all -> 0x00d0, TryCatch #0 {all -> 0x00d0, blocks: (B:11:0x0027, B:14:0x0035, B:16:0x0040, B:18:0x0044, B:19:0x0048, B:20:0x004c, B:22:0x004e, B:24:0x0053, B:26:0x0059, B:28:0x005f, B:29:0x0064, B:30:0x0069, B:32:0x006c, B:50:0x009b, B:54:0x00a6, B:56:0x00b4, B:57:0x00b9, B:59:0x00bb, B:60:0x00c0, B:61:0x00c1, B:62:0x00c7, B:63:0x00c8, B:64:0x00cf, B:39:0x007a, B:43:0x0089, B:47:0x0093, B:48:0x0099), top: B:69:0x0027, inners: #1 }] */
        /* JADX WARN: Code duplicated, block: B:29:0x0064 A[Catch: all -> 0x00d0, TryCatch #0 {all -> 0x00d0, blocks: (B:11:0x0027, B:14:0x0035, B:16:0x0040, B:18:0x0044, B:19:0x0048, B:20:0x004c, B:22:0x004e, B:24:0x0053, B:26:0x0059, B:28:0x005f, B:29:0x0064, B:30:0x0069, B:32:0x006c, B:50:0x009b, B:54:0x00a6, B:56:0x00b4, B:57:0x00b9, B:59:0x00bb, B:60:0x00c0, B:61:0x00c1, B:62:0x00c7, B:63:0x00c8, B:64:0x00cf, B:39:0x007a, B:43:0x0089, B:47:0x0093, B:48:0x0099), top: B:69:0x0027, inners: #1 }] */
        /* JADX WARN: Code duplicated, block: B:31:0x006a A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:32:0x006c A[Catch: all -> 0x00d0, TRY_LEAVE, TryCatch #0 {all -> 0x00d0, blocks: (B:11:0x0027, B:14:0x0035, B:16:0x0040, B:18:0x0044, B:19:0x0048, B:20:0x004c, B:22:0x004e, B:24:0x0053, B:26:0x0059, B:28:0x005f, B:29:0x0064, B:30:0x0069, B:32:0x006c, B:50:0x009b, B:54:0x00a6, B:56:0x00b4, B:57:0x00b9, B:59:0x00bb, B:60:0x00c0, B:61:0x00c1, B:62:0x00c7, B:63:0x00c8, B:64:0x00cf, B:39:0x007a, B:43:0x0089, B:47:0x0093, B:48:0x0099), top: B:69:0x0027, inners: #1 }] */
        /* JADX WARN: Code duplicated, block: B:34:0x0071  */
        /* JADX WARN: Code duplicated, block: B:35:0x0073  */
        /* JADX WARN: Code duplicated, block: B:41:0x0086  */
        /* JADX WARN: Code duplicated, block: B:42:0x0087  */
        /* JADX WARN: Code duplicated, block: B:45:0x008f  */
        /* JADX WARN: Code duplicated, block: B:47:0x0093 A[Catch: all -> 0x009a, TRY_ENTER, TryCatch #1 {all -> 0x009a, blocks: (B:39:0x007a, B:43:0x0089, B:47:0x0093, B:48:0x0099), top: B:70:0x007a, outer: #0 }] */
        /* JADX WARN: Code duplicated, block: B:70:0x007a A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Type inference failed for: r15v10 */
        /* JADX WARN: Type inference failed for: r15v11 */
        /* JADX WARN: Type inference failed for: r15v5, types: [V] */
        /* JADX WARN: Type inference failed for: r15v9 */
        /* JADX WARN: Type inference incomplete: some casts might be missing */
        /* JADX WARN: Unreachable blocks removed: 3, instructions: 3 */
        @Override // cm.InterfaceC2052l
        /* JADX INFO: renamed from: n */
        public V mo528n(K k10) throws Throwable {
            V vMo528n;
            Object objPut;
            C7046l c7046lMo14160k;
            ?? r15;
            ConcurrentMap<K, Object> concurrentMap = this.f39840b;
            V v10 = (V) concurrentMap.get(k10);
            Object obj = WrappedValues.f39952a;
            AssertionError assertionErrorM14173c = null;
            Object obj2 = null;
            if (v10 != null && v10 != NotValue.COMPUTING) {
                WrappedValues.m14244a(v10);
                if (v10 == obj) {
                    return null;
                }
                return v10;
            }
            LockBasedStorageManager lockBasedStorageManager = this.f39839a;
            InterfaceC2075g interfaceC2075g = lockBasedStorageManager.f39829a;
            InterfaceC2075g interfaceC2075g2 = lockBasedStorageManager.f39829a;
            interfaceC2075g.lock();
            try {
                Object obj3 = concurrentMap.get(k10);
                NotValue notValue = NotValue.COMPUTING;
                if (obj3 == notValue) {
                    obj3 = NotValue.RECURSION_WAS_DETECTED;
                    C7046l c7046lMo14160k2 = lockBasedStorageManager.mo14160k(k10, "");
                    if (c7046lMo14160k2 == null) {
                        m14171a(3);
                        throw null;
                    }
                    if (!c7046lMo14160k2.f39843b) {
                        r15 = c7046lMo14160k2.f39842a;
                    } else if (obj3 != NotValue.RECURSION_WAS_DETECTED) {
                        c7046lMo14160k = lockBasedStorageManager.mo14160k(k10, "");
                        if (c7046lMo14160k != null) {
                            m14171a(3);
                            throw null;
                        }
                        if (!c7046lMo14160k.f39843b) {
                            r15 = c7046lMo14160k.f39842a;
                        } else {
                            if (obj3 != null) {
                                concurrentMap.put(k10, notValue);
                                vMo528n = this.f39841c.mo528n(k10);
                                if (vMo528n == null) {
                                    obj = vMo528n;
                                }
                                objPut = concurrentMap.put(k10, obj);
                                if (objPut == notValue) {
                                    interfaceC2075g2.unlock();
                                    return vMo528n;
                                }
                                assertionErrorM14173c = m14173c(k10, objPut);
                                throw assertionErrorM14173c;
                            }
                            WrappedValues.m14244a(obj3);
                            if (obj3 == obj) {
                                obj2 = obj3;
                            }
                            r15 = (V) obj2;
                        }
                    } else {
                        if (obj3 != null) {
                            try {
                                concurrentMap.put(k10, notValue);
                                vMo528n = this.f39841c.mo528n(k10);
                                if (vMo528n == null) {
                                    obj = vMo528n;
                                }
                                objPut = concurrentMap.put(k10, obj);
                                if (objPut == notValue) {
                                    interfaceC2075g2.unlock();
                                    return vMo528n;
                                }
                                assertionErrorM14173c = m14173c(k10, objPut);
                                throw assertionErrorM14173c;
                            } catch (Throwable th2) {
                                if (C7499b.m14928Z(th2)) {
                                    concurrentMap.remove(k10);
                                    throw th2;
                                }
                                InterfaceC7038d interfaceC7038d = lockBasedStorageManager.f39830b;
                                if (th2 == assertionErrorM14173c) {
                                    ((InterfaceC7038d.a) interfaceC7038d).getClass();
                                    throw th2;
                                }
                                Object objPut2 = concurrentMap.put(k10, new WrappedValues.C7070b(th2));
                                if (objPut2 != NotValue.COMPUTING) {
                                    throw m14173c(k10, objPut2);
                                }
                                ((InterfaceC7038d.a) interfaceC7038d).getClass();
                                throw th2;
                            }
                        }
                        WrappedValues.m14244a(obj3);
                        if (obj3 == obj) {
                            obj2 = obj3;
                        }
                        r15 = (V) obj2;
                    }
                } else if (obj3 != NotValue.RECURSION_WAS_DETECTED) {
                    c7046lMo14160k = lockBasedStorageManager.mo14160k(k10, "");
                    if (c7046lMo14160k != null) {
                        m14171a(3);
                        throw null;
                    }
                    if (!c7046lMo14160k.f39843b) {
                        r15 = c7046lMo14160k.f39842a;
                    } else {
                        if (obj3 != null) {
                            concurrentMap.put(k10, notValue);
                            vMo528n = this.f39841c.mo528n(k10);
                            if (vMo528n == null) {
                                obj = vMo528n;
                            }
                            objPut = concurrentMap.put(k10, obj);
                            if (objPut == notValue) {
                                interfaceC2075g2.unlock();
                                return vMo528n;
                            }
                            assertionErrorM14173c = m14173c(k10, objPut);
                            throw assertionErrorM14173c;
                        }
                        WrappedValues.m14244a(obj3);
                        if (obj3 == obj) {
                            obj2 = obj3;
                        }
                        r15 = (V) obj2;
                    }
                } else {
                    if (obj3 != null) {
                        concurrentMap.put(k10, notValue);
                        vMo528n = this.f39841c.mo528n(k10);
                        if (vMo528n == null) {
                            obj = vMo528n;
                        }
                        objPut = concurrentMap.put(k10, obj);
                        if (objPut == notValue) {
                            interfaceC2075g2.unlock();
                            return vMo528n;
                        }
                        assertionErrorM14173c = m14173c(k10, objPut);
                        throw assertionErrorM14173c;
                    }
                    WrappedValues.m14244a(obj3);
                    if (obj3 == obj) {
                        obj2 = obj3;
                    }
                    r15 = (V) obj2;
                }
                interfaceC2075g2.unlock();
                return (V) r15;
            } catch (Throwable th3) {
                interfaceC2075g2.unlock();
                throw th3;
            }
        }
    }

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager$k */
    public static class C7045k<K, V> extends C7044j<K, V> implements InterfaceC2071c<K, V> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        public C7045k(LockBasedStorageManager lockBasedStorageManager, ConcurrentHashMap concurrentHashMap, InterfaceC2052l interfaceC2052l) {
            super(lockBasedStorageManager, concurrentHashMap, interfaceC2052l);
            if (lockBasedStorageManager != null) {
            } else {
                m14174a(0);
                throw null;
            }
        }

        /* JADX INFO: renamed from: a */
        public static /* synthetic */ void m14174a(int i10) {
            String str = i10 != 3 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
            Object[] objArr = new Object[i10 != 3 ? 3 : 2];
            if (i10 == 1) {
                objArr[0] = "map";
            } else if (i10 == 2) {
                objArr[0] = "compute";
            } else if (i10 != 3) {
                objArr[0] = "storageManager";
            } else {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$MapBasedMemoizedFunctionToNotNull";
            }
            if (i10 != 3) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$MapBasedMemoizedFunctionToNotNull";
            } else {
                objArr[1] = "invoke";
            }
            if (i10 != 3) {
                objArr[2] = "<init>";
            }
            String str2 = String.format(str, objArr);
            if (i10 == 3) {
                throw new IllegalStateException(str2);
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.C7044j, cm.InterfaceC2052l
        /* JADX INFO: renamed from: n */
        public final V mo528n(K k10) {
            V v10 = (V) super.mo528n(k10);
            if (v10 != null) {
                return v10;
            }
            m14174a(3);
            throw null;
        }
    }

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager$l */
    public static class C7046l<T> {

        /* JADX INFO: renamed from: a */
        public final T f39842a;

        /* JADX INFO: renamed from: b */
        public final boolean f39843b;

        public C7046l(T t10, boolean z10) {
            this.f39842a = t10;
            this.f39843b = z10;
        }

        public final String toString() {
            return this.f39843b ? "FALL_THROUGH" : String.valueOf(this.f39842a);
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    public LockBasedStorageManager() {
        throw null;
    }

    public LockBasedStorageManager(String str) {
        this(str, new C2070b(0));
    }

    public LockBasedStorageManager(String str, InterfaceC2075g interfaceC2075g) {
        InterfaceC7038d.a aVar = InterfaceC7038d.f39832a;
        this.f39829a = interfaceC2075g;
        this.f39830b = aVar;
        this.f39831c = str;
    }

    /* JADX WARN: Code duplicated, block: B:52:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:54:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:55:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:56:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:57:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:58:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:59:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:60:0x00db  */
    /* JADX WARN: Code duplicated, block: B:61:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:62:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:63:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:64:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:65:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:66:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:67:0x0103  */
    /* JADX INFO: renamed from: i */
    public static /* synthetic */ void m14157i(int i10) {
        String str;
        String str2 = (i10 == 10 || i10 == 13 || i10 == 20 || i10 == 37) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i10 == 10 || i10 == 13 || i10 == 20 || i10 == 37) ? 2 : 3];
        if (i10 != 1 && i10 != 3 && i10 != 5) {
            if (i10 != 6) {
                switch (i10) {
                    case 8:
                        break;
                    case 9:
                    case 11:
                    case 14:
                    case 16:
                    case 19:
                    case 21:
                        objArr[0] = "compute";
                        break;
                    case 10:
                    case 13:
                    case 20:
                    case 37:
                        objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager";
                        break;
                    case 12:
                    case 17:
                    case 25:
                    case 27:
                        objArr[0] = "onRecursiveCall";
                        break;
                    case 15:
                    case 18:
                    case 22:
                        objArr[0] = "map";
                        break;
                    case 23:
                    case 24:
                    case 26:
                    case 28:
                    case 30:
                    case 31:
                    case 32:
                    case 34:
                        objArr[0] = "computable";
                        break;
                    case 29:
                    case 33:
                        objArr[0] = "postCompute";
                        break;
                    case 35:
                        objArr[0] = "source";
                        break;
                    case 36:
                        objArr[0] = "throwable";
                        break;
                    default:
                        objArr[0] = "debugText";
                        break;
                }
            } else {
                objArr[0] = "lock";
            }
            if (i10 != 10 || i10 == 13) {
                objArr[1] = "createMemoizedFunction";
            } else if (i10 == 20) {
                objArr[1] = "createMemoizedFunctionWithNullableValues";
            } else if (i10 != 37) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager";
            } else {
                objArr[1] = "sanitizeStackTrace";
            }
            switch (i10) {
                case 4:
                case 5:
                case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
                    objArr[2] = "<init>";
                    break;
                case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                case 8:
                    objArr[2] = "replaceExceptionHandling";
                    break;
                case 9:
                case 11:
                case 12:
                case 14:
                case 15:
                case 16:
                case 17:
                case 18:
                    objArr[2] = "createMemoizedFunction";
                    break;
                case 10:
                case 13:
                case 20:
                case 37:
                    break;
                case 19:
                case 21:
                case 22:
                    objArr[2] = "createMemoizedFunctionWithNullableValues";
                    break;
                case 23:
                case 24:
                case 25:
                    objArr[2] = "createLazyValue";
                    break;
                case 26:
                case 27:
                    objArr[2] = "createRecursionTolerantLazyValue";
                    break;
                case 28:
                case 29:
                    objArr[2] = "createLazyValueWithPostCompute";
                    break;
                case 30:
                    objArr[2] = "createNullableLazyValue";
                    break;
                case 31:
                    objArr[2] = "createRecursionTolerantNullableLazyValue";
                    break;
                case 32:
                case 33:
                    objArr[2] = "createNullableLazyValueWithPostCompute";
                    break;
                case 34:
                    objArr[2] = "compute";
                    break;
                case 35:
                    objArr[2] = "recursionDetectedDefault";
                    break;
                case 36:
                    objArr[2] = "sanitizeStackTrace";
                    break;
                default:
                    objArr[2] = "createWithExceptionHandling";
                    break;
            }
            str = String.format(str2, objArr);
            if (i10 == 10 && i10 != 13 && i10 != 20 && i10 != 37) {
                throw new IllegalArgumentException(str);
            }
            throw new IllegalStateException(str);
        }
        objArr[0] = "exceptionHandlingStrategy";
        if (i10 != 10) {
            objArr[1] = "createMemoizedFunction";
        } else {
            objArr[1] = "createMemoizedFunction";
        }
        switch (i10) {
            case 4:
            case 5:
            case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
                objArr[2] = "<init>";
                break;
            case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
            case 8:
                objArr[2] = "replaceExceptionHandling";
                break;
            case 9:
            case 11:
            case 12:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
                objArr[2] = "createMemoizedFunction";
                break;
            case 10:
            case 13:
            case 20:
            case 37:
                break;
            case 19:
            case 21:
            case 22:
                objArr[2] = "createMemoizedFunctionWithNullableValues";
                break;
            case 23:
            case 24:
            case 25:
                objArr[2] = "createLazyValue";
                break;
            case 26:
            case 27:
                objArr[2] = "createRecursionTolerantLazyValue";
                break;
            case 28:
            case 29:
                objArr[2] = "createLazyValueWithPostCompute";
                break;
            case 30:
                objArr[2] = "createNullableLazyValue";
                break;
            case 31:
                objArr[2] = "createRecursionTolerantNullableLazyValue";
                break;
            case 32:
            case 33:
                objArr[2] = "createNullableLazyValueWithPostCompute";
                break;
            case 34:
                objArr[2] = "compute";
                break;
            case 35:
                objArr[2] = "recursionDetectedDefault";
                break;
            case 36:
                objArr[2] = "sanitizeStackTrace";
                break;
            default:
                objArr[2] = "createWithExceptionHandling";
                break;
        }
        str = String.format(str2, objArr);
        if (i10 == 10) {
        }
        throw new IllegalStateException(str);
    }

    /* JADX INFO: renamed from: l */
    public static void m14158l(AssertionError assertionError) {
        StackTraceElement[] stackTrace = assertionError.getStackTrace();
        int length = stackTrace.length;
        int i10 = 0;
        while (i10 < length) {
            if (!stackTrace[i10].getClassName().startsWith(f39827d)) {
                List listSubList = Arrays.asList(stackTrace).subList(i10, length);
                assertionError.setStackTrace((StackTraceElement[]) listSubList.toArray(new StackTraceElement[listSubList.size()]));
            }
            i10++;
        }
        i10 = -1;
        List listSubList2 = Arrays.asList(stackTrace).subList(i10, length);
        assertionError.setStackTrace((StackTraceElement[]) listSubList2.toArray(new StackTraceElement[listSubList2.size()]));
    }

    @Override // co.InterfaceC2076h
    /* JADX INFO: renamed from: a */
    public final C7037c mo6216a() {
        return new C7037c(this, new ConcurrentHashMap(3, 1.0f, 2));
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // co.InterfaceC2076h
    /* JADX INFO: renamed from: b */
    public final C7042h mo6217b(InterfaceC2041a interfaceC2041a) {
        if (interfaceC2041a != null) {
            return new C7042h(this, interfaceC2041a);
        }
        m14157i(23);
        throw null;
    }

    @Override // co.InterfaceC2076h
    /* JADX INFO: renamed from: c */
    public final C7036b mo6218c() {
        return new C7036b(this, new ConcurrentHashMap(3, 1.0f, 2));
    }

    @Override // co.InterfaceC2076h
    /* JADX INFO: renamed from: d */
    public final C7040f mo6219d(InterfaceC2041a interfaceC2041a) {
        return new C7040f(this, interfaceC2041a);
    }

    @Override // co.InterfaceC2076h
    /* JADX INFO: renamed from: e */
    public final C7048b mo6220e(InterfaceC2041a interfaceC2041a, InterfaceC2052l interfaceC2052l, InterfaceC2052l interfaceC2052l2) {
        return new C7048b(this, interfaceC2041a, interfaceC2052l, interfaceC2052l2);
    }

    @Override // co.InterfaceC2076h
    /* JADX INFO: renamed from: f */
    public final C7045k mo6221f(InterfaceC2052l interfaceC2052l) {
        return new C7045k(this, new ConcurrentHashMap(3, 1.0f, 2), interfaceC2052l);
    }

    @Override // co.InterfaceC2076h
    /* JADX INFO: renamed from: g */
    public final C7044j mo6222g(InterfaceC2052l interfaceC2052l) {
        return new C7044j(this, new ConcurrentHashMap(3, 1.0f, 2), interfaceC2052l);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // co.InterfaceC2076h
    /* JADX INFO: renamed from: h */
    public final C7047a mo6223h(EmptyList emptyList, InterfaceC2041a interfaceC2041a) {
        if (emptyList != null) {
            return new C7047a(this, interfaceC2041a, emptyList);
        }
        m14157i(27);
        throw null;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: j */
    public final Object m14159j(C8089f c8089f) {
        InterfaceC2075g interfaceC2075g = this.f39829a;
        interfaceC2075g.lock();
        try {
            c8089f.mo807E();
            interfaceC2075g.unlock();
            return null;
        } catch (Throwable th2) {
            try {
                ((InterfaceC7038d.a) this.f39830b).getClass();
                throw th2;
            } catch (Throwable th3) {
                interfaceC2075g.unlock();
                throw th3;
            }
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: k */
    public C7046l mo14160k(Object obj, String str) {
        String str2;
        StringBuilder sb2 = new StringBuilder("Recursion detected ");
        sb2.append(str);
        if (obj == null) {
            str2 = "";
        } else {
            str2 = "on input: " + obj;
        }
        sb2.append(str2);
        sb2.append(" under ");
        sb2.append(this);
        AssertionError assertionError = new AssertionError(sb2.toString());
        m14158l(assertionError);
        throw assertionError;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(getClass().getSimpleName());
        sb2.append("@");
        sb2.append(Integer.toHexString(hashCode()));
        sb2.append(" (");
        return C0009a.m23l(sb2, this.f39831c, ")");
    }
}
