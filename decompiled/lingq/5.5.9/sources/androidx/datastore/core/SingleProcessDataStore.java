package androidx.datastore.core;

import androidx.datastore.preferences.core.MutablePreferences;
import cm.InterfaceC2041a;
import cm.InterfaceC2052l;
import cm.InterfaceC2056p;
import dm.C5206f;
import dm.C5207g;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.C6740a;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.collections.C6752c;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.flow.C7120g;
import kotlinx.coroutines.flow.C7136q;
import kotlinx.coroutines.flow.InterfaceC7116c;
import kotlinx.coroutines.flow.StateFlowImpl;
import kotlinx.coroutines.sync.InterfaceC7198b;
import kotlinx.coroutines.sync.MutexImpl;
import no.C7828f;
import no.C7864r;
import no.InterfaceC7861q;
import no.InterfaceC7882z;
import p129g3.AbstractC5692i;
import p129g3.C5685b;
import p129g3.C5688e;
import p129g3.C5690g;
import p129g3.C5693j;
import p129g3.InterfaceC5684a;
import p129g3.InterfaceC5687d;
import p129g3.InterfaceC5689f;
import p129g3.InterfaceC5691h;
import p144h3.C5885a;
import p212k3.C6580b;
import p260m8.C7499b;
import p349qo.C8656b;
import p464wl.InterfaceC9968c;
import sl.C9072e;
import sl.InterfaceC9070c;

/* JADX INFO: loaded from: classes.dex */
public final class SingleProcessDataStore<T> implements InterfaceC5687d<T> {

    /* JADX INFO: renamed from: k */
    public static final LinkedHashSet f5663k = new LinkedHashSet();

    /* JADX INFO: renamed from: l */
    public static final Object f5664l = new Object();

    /* JADX INFO: renamed from: a */
    public final InterfaceC2041a<File> f5665a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC5691h<T> f5666b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC5684a<T> f5667c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC7882z f5668d;

    /* JADX INFO: renamed from: e */
    public final C7136q f5669e;

    /* JADX INFO: renamed from: f */
    public final String f5670f;

    /* JADX INFO: renamed from: g */
    public final InterfaceC9070c f5671g;

    /* JADX INFO: renamed from: h */
    public final StateFlowImpl f5672h;

    /* JADX INFO: renamed from: i */
    public List<? extends InterfaceC2056p<? super InterfaceC5689f<T>, ? super InterfaceC9968c<? super C9072e>, ? extends Object>> f5673i;

    /* JADX INFO: renamed from: j */
    public final SimpleActor<AbstractC0790a<T>> f5674j;

    /* JADX INFO: renamed from: androidx.datastore.core.SingleProcessDataStore$a */
    public static abstract class AbstractC0790a<T> {

        /* JADX INFO: renamed from: androidx.datastore.core.SingleProcessDataStore$a$a */
        public static final class a<T> extends AbstractC0790a<T> {

            /* JADX INFO: renamed from: a */
            public final AbstractC5692i<T> f5675a;

            public a(AbstractC5692i<T> abstractC5692i) {
                this.f5675a = abstractC5692i;
            }
        }

        /* JADX INFO: renamed from: androidx.datastore.core.SingleProcessDataStore$a$b */
        public static final class b<T> extends AbstractC0790a<T> {

            /* JADX INFO: renamed from: a */
            public final InterfaceC2056p<T, InterfaceC9968c<? super T>, Object> f5676a;

            /* JADX INFO: renamed from: b */
            public final InterfaceC7861q<T> f5677b;

            /* JADX INFO: renamed from: c */
            public final AbstractC5692i<T> f5678c;

            /* JADX INFO: renamed from: d */
            public final CoroutineContext f5679d;

            public b(InterfaceC2056p interfaceC2056p, C7864r c7864r, AbstractC5692i abstractC5692i, CoroutineContext coroutineContext) {
                C5207g.m11111f(coroutineContext, "callerContext");
                this.f5676a = interfaceC2056p;
                this.f5677b = c7864r;
                this.f5678c = abstractC5692i;
                this.f5679d = coroutineContext;
            }
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.core.SingleProcessDataStore$b */
    public static final class C0791b extends OutputStream {

        /* JADX INFO: renamed from: a */
        public final FileOutputStream f5685a;

        public C0791b(FileOutputStream fileOutputStream) {
            this.f5685a = fileOutputStream;
        }

        @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
        }

        @Override // java.io.OutputStream, java.io.Flushable
        public final void flush() throws IOException {
            this.f5685a.flush();
        }

        @Override // java.io.OutputStream
        public final void write(int i10) throws IOException {
            this.f5685a.write(i10);
        }

        @Override // java.io.OutputStream
        public final void write(byte[] bArr) throws IOException {
            C5207g.m11111f(bArr, "b");
            this.f5685a.write(bArr);
        }

        @Override // java.io.OutputStream
        public final void write(byte[] bArr, int i10, int i11) throws IOException {
            C5207g.m11111f(bArr, "bytes");
            this.f5685a.write(bArr, i10, i11);
        }
    }

    public SingleProcessDataStore(InterfaceC2041a interfaceC2041a, List list, C5885a c5885a, InterfaceC7882z interfaceC7882z) {
        C6580b c6580b = C6580b.f37404a;
        C5207g.m11111f(interfaceC7882z, "scope");
        this.f5665a = interfaceC2041a;
        this.f5666b = c6580b;
        this.f5667c = c5885a;
        this.f5668d = interfaceC7882z;
        this.f5669e = new C7136q(new SingleProcessDataStore$data$1(this, null));
        this.f5670f = ".tmp";
        this.f5671g = C6740a.m13372a(new InterfaceC2041a<File>(this) { // from class: androidx.datastore.core.SingleProcessDataStore$file$2

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ SingleProcessDataStore<Object> f5695b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.f5695b = this;
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final File mo807E() {
                File fileMo807E = this.f5695b.f5665a.mo807E();
                String absolutePath = fileMo807E.getAbsolutePath();
                synchronized (SingleProcessDataStore.f5664l) {
                    LinkedHashSet linkedHashSet = SingleProcessDataStore.f5663k;
                    if (!(!linkedHashSet.contains(absolutePath))) {
                        throw new IllegalStateException(("There are multiple DataStores active for the same file: " + fileMo807E + ". You should either maintain your DataStore as a singleton or confirm that there is no two DataStore's active on the same file (by confirming that the scope is cancelled).").toString());
                    }
                    C5207g.m11110e(absolutePath, "it");
                    linkedHashSet.add(absolutePath);
                }
                return fileMo807E;
            }
        });
        this.f5672h = C7120g.m14379a(C5693j.f34671a);
        this.f5673i = C6752c.m13453u0(list);
        this.f5674j = new SimpleActor<>(interfaceC7882z, new InterfaceC2052l<Throwable, C9072e>(this) { // from class: androidx.datastore.core.SingleProcessDataStore$actor$1

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ SingleProcessDataStore<Object> f5680b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
                this.f5680b = this;
            }

            /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
            @Override // cm.InterfaceC2052l
            /* JADX INFO: renamed from: n */
            public final C9072e mo528n(Throwable th2) {
                Throwable th3 = th2;
                if (th3 != null) {
                    this.f5680b.f5672h.setValue(new C5688e(th3));
                }
                Object obj = SingleProcessDataStore.f5664l;
                SingleProcessDataStore<Object> singleProcessDataStore = this.f5680b;
                synchronized (obj) {
                    try {
                        SingleProcessDataStore.f5663k.remove(singleProcessDataStore.m3007d().getAbsolutePath());
                    } catch (Throwable th4) {
                        throw th4;
                    }
                }
                return C9072e.f47360a;
            }
        }, new InterfaceC2056p<AbstractC0790a<Object>, Throwable, C9072e>() { // from class: androidx.datastore.core.SingleProcessDataStore$actor$2
            @Override // cm.InterfaceC2056p
            /* JADX INFO: renamed from: m0 */
            public final C9072e mo1337m0(SingleProcessDataStore.AbstractC0790a<Object> abstractC0790a, Throwable th2) {
                SingleProcessDataStore.AbstractC0790a<Object> abstractC0790a2 = abstractC0790a;
                Throwable cancellationException = th2;
                C5207g.m11111f(abstractC0790a2, "msg");
                if (abstractC0790a2 instanceof SingleProcessDataStore.AbstractC0790a.b) {
                    SingleProcessDataStore.AbstractC0790a.b bVar = (SingleProcessDataStore.AbstractC0790a.b) abstractC0790a2;
                    if (cancellationException == null) {
                        cancellationException = new CancellationException("DataStore scope was cancelled before updateData could complete");
                    }
                    bVar.f5677b.mo15609N0(cancellationException);
                }
                return C9072e.f47360a;
            }
        }, new SingleProcessDataStore$actor$3(this, null));
    }

    /* JADX WARN: Code duplicated, block: B:66:0x0104  */
    /* JADX WARN: Code duplicated, block: B:67:0x0108  */
    /* JADX WARN: Code duplicated, block: B:76:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [androidx.datastore.core.SingleProcessDataStore, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v17 */
    /* JADX WARN: Type inference failed for: r12v18 */
    /* JADX WARN: Type inference failed for: r12v19 */
    /* JADX WARN: Type inference failed for: r12v21 */
    /* JADX WARN: Type inference failed for: r12v22 */
    /* JADX WARN: Type inference failed for: r12v5 */
    /* JADX WARN: Type inference failed for: r12v6 */
    /* JADX WARN: Type inference failed for: r12v7 */
    /* JADX WARN: Type inference failed for: r12v9, types: [no.q] */
    /* JADX WARN: Type inference failed for: r13v10 */
    /* JADX WARN: Type inference failed for: r13v12 */
    /* JADX WARN: Type inference failed for: r13v6, types: [androidx.datastore.core.SingleProcessDataStore] */
    /* JADX WARN: Unreachable blocks removed: 3, instructions: 3 */
    /* JADX INFO: renamed from: c */
    public static final Object m3004c(SingleProcessDataStore singleProcessDataStore, AbstractC0790a.b bVar, InterfaceC9968c interfaceC9968c) throws Throwable {
        SingleProcessDataStore$handleUpdate$1 singleProcessDataStore$handleUpdate$1;
        AbstractC0790a.b bVar2;
        InterfaceC7861q<T> interfaceC7861q;
        ?? r12;
        ?? r13;
        InterfaceC7861q interfaceC7861q2;
        ?? r14;
        Throwable thM13371a;
        singleProcessDataStore.getClass();
        if (interfaceC9968c instanceof SingleProcessDataStore$handleUpdate$1) {
            singleProcessDataStore$handleUpdate$1 = (SingleProcessDataStore$handleUpdate$1) interfaceC9968c;
            int i10 = singleProcessDataStore$handleUpdate$1.f5701i;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                singleProcessDataStore$handleUpdate$1.f5701i = i10 - Integer.MIN_VALUE;
            } else {
                singleProcessDataStore$handleUpdate$1 = new SingleProcessDataStore$handleUpdate$1(singleProcessDataStore, interfaceC9968c);
            }
        } else {
            singleProcessDataStore$handleUpdate$1 = new SingleProcessDataStore$handleUpdate$1(singleProcessDataStore, interfaceC9968c);
        }
        Object objM14967u = singleProcessDataStore$handleUpdate$1.f5699g;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i11 = singleProcessDataStore$handleUpdate$1.f5701i;
        boolean z10 = true;
        if (i11 != 0) {
            try {
                if (i11 != 1) {
                    if (i11 == 2) {
                        InterfaceC7861q interfaceC7861q3 = singleProcessDataStore$handleUpdate$1.f5698f;
                        SingleProcessDataStore singleProcessDataStore2 = singleProcessDataStore$handleUpdate$1.f5697e;
                        bVar2 = (AbstractC0790a.b) singleProcessDataStore$handleUpdate$1.f5696d;
                        C7499b.m14977z0(objM14967u);
                        interfaceC7861q2 = interfaceC7861q3;
                        r13 = singleProcessDataStore2;
                        try {
                            InterfaceC2056p<T, InterfaceC9968c<? super T>, Object> interfaceC2056p = bVar2.f5676a;
                            CoroutineContext coroutineContext = bVar2.f5679d;
                            singleProcessDataStore$handleUpdate$1.f5696d = interfaceC7861q2;
                            singleProcessDataStore$handleUpdate$1.f5697e = null;
                            singleProcessDataStore$handleUpdate$1.f5698f = null;
                            singleProcessDataStore$handleUpdate$1.f5701i = 3;
                            objM14967u = r13.m3013j(singleProcessDataStore$handleUpdate$1, coroutineContext, interfaceC2056p);
                            r12 = interfaceC7861q2;
                            if (objM14967u == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            interfaceC7861q = (InterfaceC7861q<T>) interfaceC7861q2;
                            singleProcessDataStore = interfaceC7861q;
                            objM14967u = C7499b.m14967u(th);
                            r12 = singleProcessDataStore;
                        }
                        r14 = r12;
                    } else if (i11 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                }
                InterfaceC7861q interfaceC7861q4 = (InterfaceC7861q) singleProcessDataStore$handleUpdate$1.f5696d;
                C7499b.m14977z0(objM14967u);
                r14 = interfaceC7861q4;
            } catch (Throwable th3) {
                th = th3;
                objM14967u = C7499b.m14967u(th);
                r12 = singleProcessDataStore;
            }
        } else {
            C7499b.m14977z0(objM14967u);
            interfaceC7861q = bVar.f5677b;
            try {
                AbstractC5692i<T> abstractC5692i = (AbstractC5692i) singleProcessDataStore.f5672h.getValue();
                if (abstractC5692i instanceof C5685b) {
                    InterfaceC2056p<T, InterfaceC9968c<? super T>, Object> interfaceC2056p2 = bVar.f5676a;
                    CoroutineContext coroutineContext2 = bVar.f5679d;
                    singleProcessDataStore$handleUpdate$1.f5696d = interfaceC7861q;
                    singleProcessDataStore$handleUpdate$1.f5701i = 1;
                    Object objM3013j = singleProcessDataStore.m3013j(singleProcessDataStore$handleUpdate$1, coroutineContext2, interfaceC2056p2);
                    if (objM3013j == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    objM14967u = objM3013j;
                    r14 = interfaceC7861q;
                } else {
                    if (!(abstractC5692i instanceof C5690g)) {
                        z10 = abstractC5692i instanceof C5693j;
                    }
                    if (!z10) {
                        if (abstractC5692i instanceof C5688e) {
                            throw ((C5688e) abstractC5692i).f34669a;
                        }
                        throw new NoWhenBranchMatchedException();
                    }
                    if (abstractC5692i != bVar.f5678c) {
                        throw ((C5690g) abstractC5692i).f34670a;
                    }
                    singleProcessDataStore$handleUpdate$1.f5696d = bVar;
                    singleProcessDataStore$handleUpdate$1.f5697e = singleProcessDataStore;
                    singleProcessDataStore$handleUpdate$1.f5698f = interfaceC7861q;
                    singleProcessDataStore$handleUpdate$1.f5701i = 2;
                    if (singleProcessDataStore.m3009f(singleProcessDataStore$handleUpdate$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    bVar2 = bVar;
                    r13 = singleProcessDataStore;
                    interfaceC7861q2 = interfaceC7861q;
                    InterfaceC2056p<T, InterfaceC9968c<? super T>, Object> interfaceC2056p3 = bVar2.f5676a;
                    CoroutineContext coroutineContext3 = bVar2.f5679d;
                    singleProcessDataStore$handleUpdate$1.f5696d = interfaceC7861q2;
                    singleProcessDataStore$handleUpdate$1.f5697e = null;
                    singleProcessDataStore$handleUpdate$1.f5698f = null;
                    singleProcessDataStore$handleUpdate$1.f5701i = 3;
                    objM14967u = r13.m3013j(singleProcessDataStore$handleUpdate$1, coroutineContext3, interfaceC2056p3);
                    r12 = interfaceC7861q2;
                    if (objM14967u == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    r14 = r12;
                }
            } catch (Throwable th4) {
                th = th4;
                singleProcessDataStore = interfaceC7861q;
                objM14967u = C7499b.m14967u(th);
                r12 = singleProcessDataStore;
                r14 = r12;
                thM13371a = Result.m13371a(objM14967u);
                if (thM13371a == null) {
                    r14.m15610P0(objM14967u);
                } else {
                    r14.mo15609N0(thM13371a);
                }
                return C9072e.f47360a;
            }
        }
        thM13371a = Result.m13371a(objM14967u);
        if (thM13371a == null) {
            r14.m15610P0(objM14967u);
        } else {
            r14.mo15609N0(thM13371a);
        }
        return C9072e.f47360a;
    }

    @Override // p129g3.InterfaceC5687d
    /* JADX INFO: renamed from: a */
    public final InterfaceC7116c<T> mo3005a() {
        return this.f5669e;
    }

    @Override // p129g3.InterfaceC5687d
    /* JADX INFO: renamed from: b */
    public final Object mo3006b(InterfaceC2056p<? super T, ? super InterfaceC9968c<? super T>, ? extends Object> interfaceC2056p, InterfaceC9968c<? super T> interfaceC9968c) {
        C7864r c7864r = new C7864r(null);
        this.f5674j.m3003a(new AbstractC0790a.b(interfaceC2056p, c7864r, (AbstractC5692i) this.f5672h.getValue(), interfaceC9968c.mo2029e()));
        return c7864r.m15612j0(interfaceC9968c);
    }

    /* JADX INFO: renamed from: d */
    public final File m3007d() {
        return (File) this.f5671g.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:37:0x0105 A[LOOP:0: B:38:0x0106->B:37:0x0105, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:40:0x010c  */
    /* JADX WARN: Code duplicated, block: B:46:0x0149  */
    /* JADX WARN: Code duplicated, block: B:48:0x014b  */
    /* JADX WARN: Code duplicated, block: B:52:0x0163  */
    /* JADX WARN: Code duplicated, block: B:66:0x012c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    /* JADX INFO: renamed from: e */
    public final Object m3008e(InterfaceC9968c<? super C9072e> interfaceC9968c) throws Throwable {
        SingleProcessDataStore$readAndInit$1 singleProcessDataStore$readAndInit$1;
        Ref$ObjectRef ref$ObjectRef;
        SingleProcessDataStore singleProcessDataStore;
        InterfaceC7198b interfaceC7198b;
        Ref$ObjectRef ref$ObjectRef2;
        Ref$BooleanRef ref$BooleanRef;
        SingleProcessDataStore$readAndInit$api$1 singleProcessDataStore$readAndInit$api$1;
        Iterator<T> it;
        Ref$BooleanRef ref$BooleanRef2;
        Ref$ObjectRef ref$ObjectRef3;
        InterfaceC7198b interfaceC7198b2;
        SingleProcessDataStore singleProcessDataStore2;
        InterfaceC2056p interfaceC2056p;
        T t10;
        if (interfaceC9968c instanceof SingleProcessDataStore$readAndInit$1) {
            singleProcessDataStore$readAndInit$1 = (SingleProcessDataStore$readAndInit$1) interfaceC9968c;
            int i10 = singleProcessDataStore$readAndInit$1.f5710l;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                singleProcessDataStore$readAndInit$1.f5710l = i10 - Integer.MIN_VALUE;
            } else {
                singleProcessDataStore$readAndInit$1 = new SingleProcessDataStore$readAndInit$1(this, interfaceC9968c);
            }
        } else {
            singleProcessDataStore$readAndInit$1 = new SingleProcessDataStore$readAndInit$1(this, interfaceC9968c);
        }
        T t11 = (T) singleProcessDataStore$readAndInit$1.f5708j;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i11 = singleProcessDataStore$readAndInit$1.f5710l;
        int iHashCode = 0;
        if (i11 != 0) {
            if (i11 == 1) {
                ref$ObjectRef = (Ref$ObjectRef) singleProcessDataStore$readAndInit$1.f5705g;
                Ref$ObjectRef ref$ObjectRef4 = (Ref$ObjectRef) singleProcessDataStore$readAndInit$1.f5704f;
                InterfaceC7198b interfaceC7198b3 = (InterfaceC7198b) singleProcessDataStore$readAndInit$1.f5703e;
                SingleProcessDataStore singleProcessDataStore3 = singleProcessDataStore$readAndInit$1.f5702d;
                C7499b.m14977z0(t11);
                interfaceC7198b = interfaceC7198b3;
                singleProcessDataStore = singleProcessDataStore3;
                ref$ObjectRef2 = ref$ObjectRef4;
            } else if (i11 == 2) {
                it = singleProcessDataStore$readAndInit$1.f5707i;
                singleProcessDataStore$readAndInit$api$1 = singleProcessDataStore$readAndInit$1.f5706h;
                ref$BooleanRef = (Ref$BooleanRef) singleProcessDataStore$readAndInit$1.f5705g;
                ref$ObjectRef2 = (Ref$ObjectRef) singleProcessDataStore$readAndInit$1.f5704f;
                interfaceC7198b = (InterfaceC7198b) singleProcessDataStore$readAndInit$1.f5703e;
                singleProcessDataStore = singleProcessDataStore$readAndInit$1.f5702d;
                C7499b.m14977z0(t11);
                while (it.hasNext()) {
                    interfaceC2056p = (InterfaceC2056p) it.next();
                    singleProcessDataStore$readAndInit$1.f5702d = singleProcessDataStore;
                    singleProcessDataStore$readAndInit$1.f5703e = interfaceC7198b;
                    singleProcessDataStore$readAndInit$1.f5704f = ref$ObjectRef2;
                    singleProcessDataStore$readAndInit$1.f5705g = ref$BooleanRef;
                    singleProcessDataStore$readAndInit$1.f5706h = singleProcessDataStore$readAndInit$api$1;
                    singleProcessDataStore$readAndInit$1.f5707i = it;
                    singleProcessDataStore$readAndInit$1.f5710l = 2;
                    if (interfaceC2056p.mo1337m0(singleProcessDataStore$readAndInit$api$1, singleProcessDataStore$readAndInit$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
                ref$BooleanRef2 = ref$BooleanRef;
                singleProcessDataStore.f5673i = null;
                singleProcessDataStore$readAndInit$1.f5702d = singleProcessDataStore;
                singleProcessDataStore$readAndInit$1.f5703e = ref$ObjectRef2;
                singleProcessDataStore$readAndInit$1.f5704f = ref$BooleanRef2;
                singleProcessDataStore$readAndInit$1.f5705g = interfaceC7198b;
                singleProcessDataStore$readAndInit$1.f5706h = null;
                singleProcessDataStore$readAndInit$1.f5707i = null;
                singleProcessDataStore$readAndInit$1.f5710l = 3;
                if (interfaceC7198b.mo14510a(null, singleProcessDataStore$readAndInit$1) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                ref$ObjectRef3 = ref$ObjectRef2;
                interfaceC7198b2 = interfaceC7198b;
                singleProcessDataStore2 = singleProcessDataStore;
            } else {
                if (i11 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                interfaceC7198b2 = (InterfaceC7198b) singleProcessDataStore$readAndInit$1.f5705g;
                ref$BooleanRef2 = (Ref$BooleanRef) singleProcessDataStore$readAndInit$1.f5704f;
                ref$ObjectRef3 = (Ref$ObjectRef) singleProcessDataStore$readAndInit$1.f5703e;
                SingleProcessDataStore singleProcessDataStore4 = singleProcessDataStore$readAndInit$1.f5702d;
                C7499b.m14977z0(t11);
                singleProcessDataStore2 = singleProcessDataStore4;
            }
            try {
                ref$BooleanRef2.f38122a = true;
                C9072e c9072e = C9072e.f47360a;
                interfaceC7198b2.mo14511b(null);
                StateFlowImpl stateFlowImpl = singleProcessDataStore2.f5672h;
                t10 = ref$ObjectRef3.f38127a;
                if (t10 != null) {
                    iHashCode = t10.hashCode();
                }
                stateFlowImpl.setValue(new C5685b(iHashCode, t10));
                return C9072e.f47360a;
            } catch (Throwable th2) {
                interfaceC7198b2.mo14511b(null);
                throw th2;
            }
        }
        C7499b.m14977z0(t11);
        StateFlowImpl stateFlowImpl2 = this.f5672h;
        if (!(C5207g.m11106a(stateFlowImpl2.getValue(), C5693j.f34671a) || (stateFlowImpl2.getValue() instanceof C5690g))) {
            throw new IllegalStateException("Check failed.".toString());
        }
        MutexImpl mutexImpl = new MutexImpl(false);
        ref$ObjectRef = new Ref$ObjectRef();
        singleProcessDataStore$readAndInit$1.f5702d = this;
        singleProcessDataStore$readAndInit$1.f5703e = mutexImpl;
        singleProcessDataStore$readAndInit$1.f5704f = ref$ObjectRef;
        singleProcessDataStore$readAndInit$1.f5705g = ref$ObjectRef;
        singleProcessDataStore$readAndInit$1.f5710l = 1;
        Object objM3012i = m3012i(singleProcessDataStore$readAndInit$1);
        if (objM3012i == coroutineSingletons) {
            return coroutineSingletons;
        }
        singleProcessDataStore = this;
        interfaceC7198b = mutexImpl;
        ref$ObjectRef2 = ref$ObjectRef;
        t11 = (T) objM3012i;
        ref$ObjectRef.f38127a = t11;
        ref$BooleanRef = new Ref$BooleanRef();
        singleProcessDataStore$readAndInit$api$1 = new SingleProcessDataStore$readAndInit$api$1(interfaceC7198b, ref$BooleanRef, ref$ObjectRef2, singleProcessDataStore);
        List<? extends InterfaceC2056p<? super InterfaceC5689f<T>, ? super InterfaceC9968c<? super C9072e>, ? extends Object>> list = singleProcessDataStore.f5673i;
        if (list != null) {
            it = list.iterator();
            while (it.hasNext()) {
                interfaceC2056p = (InterfaceC2056p) it.next();
                singleProcessDataStore$readAndInit$1.f5702d = singleProcessDataStore;
                singleProcessDataStore$readAndInit$1.f5703e = interfaceC7198b;
                singleProcessDataStore$readAndInit$1.f5704f = ref$ObjectRef2;
                singleProcessDataStore$readAndInit$1.f5705g = ref$BooleanRef;
                singleProcessDataStore$readAndInit$1.f5706h = singleProcessDataStore$readAndInit$api$1;
                singleProcessDataStore$readAndInit$1.f5707i = it;
                singleProcessDataStore$readAndInit$1.f5710l = 2;
                if (interfaceC2056p.mo1337m0(singleProcessDataStore$readAndInit$api$1, singleProcessDataStore$readAndInit$1) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
        }
        ref$BooleanRef2 = ref$BooleanRef;
        singleProcessDataStore.f5673i = null;
        singleProcessDataStore$readAndInit$1.f5702d = singleProcessDataStore;
        singleProcessDataStore$readAndInit$1.f5703e = ref$ObjectRef2;
        singleProcessDataStore$readAndInit$1.f5704f = ref$BooleanRef2;
        singleProcessDataStore$readAndInit$1.f5705g = interfaceC7198b;
        singleProcessDataStore$readAndInit$1.f5706h = null;
        singleProcessDataStore$readAndInit$1.f5707i = null;
        singleProcessDataStore$readAndInit$1.f5710l = 3;
        if (interfaceC7198b.mo14510a(null, singleProcessDataStore$readAndInit$1) == coroutineSingletons) {
            return coroutineSingletons;
        }
        ref$ObjectRef3 = ref$ObjectRef2;
        interfaceC7198b2 = interfaceC7198b;
        singleProcessDataStore2 = singleProcessDataStore;
        ref$BooleanRef2.f38122a = true;
        C9072e c9072e2 = C9072e.f47360a;
        interfaceC7198b2.mo14511b(null);
        StateFlowImpl stateFlowImpl3 = singleProcessDataStore2.f5672h;
        t10 = ref$ObjectRef3.f38127a;
        if (t10 != null) {
            iHashCode = t10.hashCode();
        }
        stateFlowImpl3.setValue(new C5685b(iHashCode, t10));
        return C9072e.f47360a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0018  */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: f */
    public final Object m3009f(InterfaceC9968c<? super C9072e> interfaceC9968c) throws Throwable {
        SingleProcessDataStore$readAndInitOrPropagateAndThrowFailure$1 singleProcessDataStore$readAndInitOrPropagateAndThrowFailure$1;
        SingleProcessDataStore singleProcessDataStore;
        if (interfaceC9968c instanceof SingleProcessDataStore$readAndInitOrPropagateAndThrowFailure$1) {
            singleProcessDataStore$readAndInitOrPropagateAndThrowFailure$1 = (SingleProcessDataStore$readAndInitOrPropagateAndThrowFailure$1) interfaceC9968c;
            int i10 = singleProcessDataStore$readAndInitOrPropagateAndThrowFailure$1.f5726g;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                singleProcessDataStore$readAndInitOrPropagateAndThrowFailure$1.f5726g = i10 - Integer.MIN_VALUE;
            } else {
                singleProcessDataStore$readAndInitOrPropagateAndThrowFailure$1 = new SingleProcessDataStore$readAndInitOrPropagateAndThrowFailure$1(this, interfaceC9968c);
            }
        } else {
            singleProcessDataStore$readAndInitOrPropagateAndThrowFailure$1 = new SingleProcessDataStore$readAndInitOrPropagateAndThrowFailure$1(this, interfaceC9968c);
        }
        Object obj = singleProcessDataStore$readAndInitOrPropagateAndThrowFailure$1.f5724e;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i11 = singleProcessDataStore$readAndInitOrPropagateAndThrowFailure$1.f5726g;
        if (i11 != 0) {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            singleProcessDataStore = singleProcessDataStore$readAndInitOrPropagateAndThrowFailure$1.f5723d;
            try {
                C7499b.m14977z0(obj);
            } catch (Throwable th2) {
                th = th2;
                singleProcessDataStore.f5672h.setValue(new C5690g(th));
                throw th;
            }
        }
        C7499b.m14977z0(obj);
        try {
            singleProcessDataStore$readAndInitOrPropagateAndThrowFailure$1.f5723d = this;
            singleProcessDataStore$readAndInitOrPropagateAndThrowFailure$1.f5726g = 1;
            return m3008e(singleProcessDataStore$readAndInitOrPropagateAndThrowFailure$1) == coroutineSingletons ? coroutineSingletons : C9072e.f47360a;
        } catch (Throwable th3) {
            th = th3;
            singleProcessDataStore = this;
            singleProcessDataStore.f5672h.setValue(new C5690g(th));
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX INFO: renamed from: g */
    public final Object m3010g(InterfaceC9968c<? super C9072e> interfaceC9968c) throws Throwable {
        SingleProcessDataStore$readAndInitOrPropagateFailure$1 singleProcessDataStore$readAndInitOrPropagateFailure$1;
        SingleProcessDataStore singleProcessDataStore;
        if (interfaceC9968c instanceof SingleProcessDataStore$readAndInitOrPropagateFailure$1) {
            singleProcessDataStore$readAndInitOrPropagateFailure$1 = (SingleProcessDataStore$readAndInitOrPropagateFailure$1) interfaceC9968c;
            int i10 = singleProcessDataStore$readAndInitOrPropagateFailure$1.f5730g;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                singleProcessDataStore$readAndInitOrPropagateFailure$1.f5730g = i10 - Integer.MIN_VALUE;
            } else {
                singleProcessDataStore$readAndInitOrPropagateFailure$1 = new SingleProcessDataStore$readAndInitOrPropagateFailure$1(this, interfaceC9968c);
            }
        } else {
            singleProcessDataStore$readAndInitOrPropagateFailure$1 = new SingleProcessDataStore$readAndInitOrPropagateFailure$1(this, interfaceC9968c);
        }
        Object obj = singleProcessDataStore$readAndInitOrPropagateFailure$1.f5728e;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i11 = singleProcessDataStore$readAndInitOrPropagateFailure$1.f5730g;
        if (i11 != 0) {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            singleProcessDataStore = singleProcessDataStore$readAndInitOrPropagateFailure$1.f5727d;
            try {
                C7499b.m14977z0(obj);
            } catch (Throwable th2) {
                th = th2;
                singleProcessDataStore.f5672h.setValue(new C5690g(th));
            }
            return C9072e.f47360a;
        }
        C7499b.m14977z0(obj);
        try {
            singleProcessDataStore$readAndInitOrPropagateFailure$1.f5727d = this;
            singleProcessDataStore$readAndInitOrPropagateFailure$1.f5730g = 1;
            if (m3008e(singleProcessDataStore$readAndInitOrPropagateFailure$1) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } catch (Throwable th3) {
            th = th3;
            singleProcessDataStore = this;
            singleProcessDataStore.f5672h.setValue(new C5690g(th));
        }
        return C9072e.f47360a;
        singleProcessDataStore.f5672h.setValue(new C5690g(th));
        return C9072e.f47360a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v12, types: [androidx.datastore.core.SingleProcessDataStore] */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v2, types: [androidx.datastore.core.SingleProcessDataStore$readData$1] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [androidx.datastore.core.SingleProcessDataStore] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX INFO: renamed from: h */
    public final Object m3011h(InterfaceC9968c<? super T> interfaceC9968c) throws Throwable {
        ?? singleProcessDataStore$readData$1;
        FileInputStream fileInputStream;
        Throwable th2;
        if (interfaceC9968c instanceof SingleProcessDataStore$readData$1) {
            SingleProcessDataStore$readData$1 singleProcessDataStore$readData$2 = (SingleProcessDataStore$readData$1) interfaceC9968c;
            int i10 = singleProcessDataStore$readData$2.f5735h;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                singleProcessDataStore$readData$2.f5735h = i10 - Integer.MIN_VALUE;
                singleProcessDataStore$readData$1 = singleProcessDataStore$readData$2;
            } else {
                singleProcessDataStore$readData$1 = new SingleProcessDataStore$readData$1(this, interfaceC9968c);
            }
        } else {
            singleProcessDataStore$readData$1 = new SingleProcessDataStore$readData$1(this, interfaceC9968c);
        }
        Object obj = singleProcessDataStore$readData$1.f5733f;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i11 = singleProcessDataStore$readData$1.f5735h;
        try {
            if (i11 != 0) {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                fileInputStream = singleProcessDataStore$readData$1.f5732e;
                singleProcessDataStore$readData$1 = singleProcessDataStore$readData$1.f5731d;
                try {
                    C7499b.m14977z0(obj);
                    C5206f.m11032z0(fileInputStream, null);
                    return obj;
                } catch (Throwable th3) {
                    th2 = th3;
                    try {
                        throw th2;
                    } catch (Throwable th4) {
                        C5206f.m11032z0(fileInputStream, th2);
                        throw th4;
                    }
                }
            }
            C7499b.m14977z0(obj);
            try {
                FileInputStream fileInputStream2 = new FileInputStream(m3007d());
                try {
                    InterfaceC5691h<T> interfaceC5691h = this.f5666b;
                    singleProcessDataStore$readData$1.f5731d = this;
                    singleProcessDataStore$readData$1.f5732e = fileInputStream2;
                    singleProcessDataStore$readData$1.f5735h = 1;
                    MutablePreferences mutablePreferencesMo12054b = interfaceC5691h.mo12054b(fileInputStream2);
                    if (mutablePreferencesMo12054b == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    fileInputStream = fileInputStream2;
                    obj = mutablePreferencesMo12054b;
                    C5206f.m11032z0(fileInputStream, null);
                    return obj;
                } catch (Throwable th5) {
                    fileInputStream = fileInputStream2;
                    th2 = th5;
                    singleProcessDataStore$readData$1 = this;
                    throw th2;
                }
            } catch (FileNotFoundException e10) {
                e = e10;
                singleProcessDataStore$readData$1 = this;
                if (singleProcessDataStore$readData$1.m3007d().exists()) {
                    throw e;
                }
                return singleProcessDataStore$readData$1.f5666b.mo12053a();
            }
        } catch (FileNotFoundException e11) {
            e = e11;
        }
    }

    /* JADX WARN: Code duplicated, block: B:39:0x0094  */
    /* JADX WARN: Code duplicated, block: B:41:0x0096  */
    /* JADX WARN: Code duplicated, block: B:44:0x00a6 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:45:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [androidx.datastore.core.SingleProcessDataStore, androidx.datastore.core.SingleProcessDataStore<T>, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2, types: [androidx.datastore.core.SingleProcessDataStore, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v6, types: [androidx.datastore.core.SingleProcessDataStore] */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [androidx.datastore.core.SingleProcessDataStore] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: i */
    public final Object m3012i(InterfaceC9968c<? super T> interfaceC9968c) throws Throwable {
        SingleProcessDataStore$readDataOrHandleCorruption$1 singleProcessDataStore$readDataOrHandleCorruption$1;
        ?? r10;
        Object objMo12051a;
        CorruptionException corruptionException;
        ?? r11;
        CorruptionException corruptionException2;
        if (interfaceC9968c instanceof SingleProcessDataStore$readDataOrHandleCorruption$1) {
            singleProcessDataStore$readDataOrHandleCorruption$1 = (SingleProcessDataStore$readDataOrHandleCorruption$1) interfaceC9968c;
            int i10 = singleProcessDataStore$readDataOrHandleCorruption$1.f5740h;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                singleProcessDataStore$readDataOrHandleCorruption$1.f5740h = i10 - Integer.MIN_VALUE;
            } else {
                singleProcessDataStore$readDataOrHandleCorruption$1 = new SingleProcessDataStore$readDataOrHandleCorruption$1(this, interfaceC9968c);
            }
        } else {
            singleProcessDataStore$readDataOrHandleCorruption$1 = new SingleProcessDataStore$readDataOrHandleCorruption$1(this, interfaceC9968c);
        }
        Object objM3011h = singleProcessDataStore$readDataOrHandleCorruption$1.f5738f;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i11 = singleProcessDataStore$readDataOrHandleCorruption$1.f5740h;
        if (i11 == 0) {
            C7499b.m14977z0(objM3011h);
            try {
                singleProcessDataStore$readDataOrHandleCorruption$1.f5736d = this;
                singleProcessDataStore$readDataOrHandleCorruption$1.f5740h = 1;
                objM3011h = m3011h(singleProcessDataStore$readDataOrHandleCorruption$1);
                return objM3011h == coroutineSingletons ? coroutineSingletons : objM3011h;
            } catch (CorruptionException e10) {
                e = e10;
                r10 = this;
                InterfaceC5684a<T> interfaceC5684a = r10.f5667c;
                singleProcessDataStore$readDataOrHandleCorruption$1.f5736d = r10;
                singleProcessDataStore$readDataOrHandleCorruption$1.f5737e = e;
                singleProcessDataStore$readDataOrHandleCorruption$1.f5740h = 2;
                objMo12051a = interfaceC5684a.mo12051a(e);
                if (objMo12051a == coroutineSingletons) {
                    return coroutineSingletons;
                }
                ?? r12 = r10;
                corruptionException = e;
                objM3011h = objMo12051a;
                r11 = r12;
                singleProcessDataStore$readDataOrHandleCorruption$1.f5736d = corruptionException;
                singleProcessDataStore$readDataOrHandleCorruption$1.f5737e = objM3011h;
                singleProcessDataStore$readDataOrHandleCorruption$1.f5740h = 3;
                if (r11.m3014k(objM3011h, singleProcessDataStore$readDataOrHandleCorruption$1) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                return objM3011h;
            }
        }
        if (i11 != 1) {
            if (i11 == 2) {
                corruptionException = (CorruptionException) singleProcessDataStore$readDataOrHandleCorruption$1.f5737e;
                SingleProcessDataStore singleProcessDataStore = (SingleProcessDataStore) singleProcessDataStore$readDataOrHandleCorruption$1.f5736d;
                C7499b.m14977z0(objM3011h);
                r11 = singleProcessDataStore;
            } else {
                if (i11 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Object obj = singleProcessDataStore$readDataOrHandleCorruption$1.f5737e;
                corruptionException2 = (CorruptionException) singleProcessDataStore$readDataOrHandleCorruption$1.f5736d;
                try {
                    C7499b.m14977z0(objM3011h);
                    return obj;
                } catch (IOException e11) {
                    e = e11;
                }
            }
            C8656b.m16899g(corruptionException2, e);
            throw corruptionException2;
        }
        r10 = (SingleProcessDataStore) singleProcessDataStore$readDataOrHandleCorruption$1.f5736d;
        try {
            C7499b.m14977z0(objM3011h);
        } catch (CorruptionException e12) {
            e = e12;
            InterfaceC5684a<T> interfaceC5684a2 = r10.f5667c;
            singleProcessDataStore$readDataOrHandleCorruption$1.f5736d = r10;
            singleProcessDataStore$readDataOrHandleCorruption$1.f5737e = e;
            singleProcessDataStore$readDataOrHandleCorruption$1.f5740h = 2;
            objMo12051a = interfaceC5684a2.mo12051a(e);
            if (objMo12051a == coroutineSingletons) {
                return coroutineSingletons;
            }
            ?? r13 = r10;
            corruptionException = e;
            objM3011h = objMo12051a;
            r11 = r13;
            singleProcessDataStore$readDataOrHandleCorruption$1.f5736d = corruptionException;
            singleProcessDataStore$readDataOrHandleCorruption$1.f5737e = objM3011h;
            singleProcessDataStore$readDataOrHandleCorruption$1.f5740h = 3;
            if (r11.m3014k(objM3011h, singleProcessDataStore$readDataOrHandleCorruption$1) == coroutineSingletons) {
                return coroutineSingletons;
            }
            return objM3011h;
        }
        try {
            singleProcessDataStore$readDataOrHandleCorruption$1.f5736d = corruptionException;
            singleProcessDataStore$readDataOrHandleCorruption$1.f5737e = objM3011h;
            singleProcessDataStore$readDataOrHandleCorruption$1.f5740h = 3;
            if (r11.m3014k(objM3011h, singleProcessDataStore$readDataOrHandleCorruption$1) == coroutineSingletons) {
                return coroutineSingletons;
            }
            return objM3011h;
        } catch (IOException e13) {
            e = e13;
            corruptionException2 = corruptionException;
        }
    }

    /* JADX WARN: Code duplicated, block: B:31:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:32:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:7:0x001a  */
    /* JADX INFO: renamed from: j */
    public final Object m3013j(InterfaceC9968c interfaceC9968c, CoroutineContext coroutineContext, InterfaceC2056p interfaceC2056p) throws Throwable {
        SingleProcessDataStore$transformAndWrite$1 singleProcessDataStore$transformAndWrite$1;
        SingleProcessDataStore singleProcessDataStore;
        C5685b c5685b;
        Object obj;
        SingleProcessDataStore singleProcessDataStore2;
        int iHashCode;
        if (interfaceC9968c instanceof SingleProcessDataStore$transformAndWrite$1) {
            singleProcessDataStore$transformAndWrite$1 = (SingleProcessDataStore$transformAndWrite$1) interfaceC9968c;
            int i10 = singleProcessDataStore$transformAndWrite$1.f5746i;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                singleProcessDataStore$transformAndWrite$1.f5746i = i10 - Integer.MIN_VALUE;
            } else {
                singleProcessDataStore$transformAndWrite$1 = new SingleProcessDataStore$transformAndWrite$1(this, interfaceC9968c);
            }
        } else {
            singleProcessDataStore$transformAndWrite$1 = new SingleProcessDataStore$transformAndWrite$1(this, interfaceC9968c);
        }
        Object obj2 = singleProcessDataStore$transformAndWrite$1.f5744g;
        Object obj3 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i11 = singleProcessDataStore$transformAndWrite$1.f5746i;
        if (i11 != 0) {
            if (i11 == 1) {
                obj = singleProcessDataStore$transformAndWrite$1.f5743f;
                c5685b = (C5685b) singleProcessDataStore$transformAndWrite$1.f5742e;
                SingleProcessDataStore singleProcessDataStore3 = singleProcessDataStore$transformAndWrite$1.f5741d;
                C7499b.m14977z0(obj2);
                singleProcessDataStore = singleProcessDataStore3;
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                obj = singleProcessDataStore$transformAndWrite$1.f5742e;
                SingleProcessDataStore singleProcessDataStore4 = singleProcessDataStore$transformAndWrite$1.f5741d;
                C7499b.m14977z0(obj2);
                singleProcessDataStore2 = singleProcessDataStore4;
            }
            StateFlowImpl stateFlowImpl = singleProcessDataStore2.f5672h;
            if (obj != null) {
                iHashCode = obj.hashCode();
            } else {
                iHashCode = 0;
            }
            stateFlowImpl.setValue(new C5685b(iHashCode, obj));
            return obj;
        }
        C7499b.m14977z0(obj2);
        C5685b c5685b2 = (C5685b) this.f5672h.getValue();
        c5685b2.m12052a();
        Object obj4 = c5685b2.f34667a;
        SingleProcessDataStore$transformAndWrite$newData$1 singleProcessDataStore$transformAndWrite$newData$1 = new SingleProcessDataStore$transformAndWrite$newData$1(interfaceC2056p, obj4, null);
        singleProcessDataStore$transformAndWrite$1.f5741d = this;
        singleProcessDataStore$transformAndWrite$1.f5742e = c5685b2;
        singleProcessDataStore$transformAndWrite$1.f5743f = obj4;
        singleProcessDataStore$transformAndWrite$1.f5746i = 1;
        Object objM15574h = C7828f.m15574h(singleProcessDataStore$transformAndWrite$1, coroutineContext, singleProcessDataStore$transformAndWrite$newData$1);
        if (objM15574h == obj3) {
            return obj3;
        }
        singleProcessDataStore = this;
        c5685b = c5685b2;
        obj2 = objM15574h;
        obj = obj4;
        c5685b.m12052a();
        if (!C5207g.m11106a(obj, obj2)) {
            singleProcessDataStore$transformAndWrite$1.f5741d = singleProcessDataStore;
            singleProcessDataStore$transformAndWrite$1.f5742e = obj2;
            singleProcessDataStore$transformAndWrite$1.f5743f = null;
            singleProcessDataStore$transformAndWrite$1.f5746i = 2;
            if (singleProcessDataStore.m3014k(obj2, singleProcessDataStore$transformAndWrite$1) == obj3) {
                return obj3;
            }
            obj = obj2;
            singleProcessDataStore2 = singleProcessDataStore;
            StateFlowImpl stateFlowImpl2 = singleProcessDataStore2.f5672h;
            if (obj != null) {
                iHashCode = obj.hashCode();
            } else {
                iHashCode = 0;
            }
            stateFlowImpl2.setValue(new C5685b(iHashCode, obj));
        }
        return obj;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001a  */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: k */
    public final Object m3014k(T t10, InterfaceC9968c<? super C9072e> interfaceC9968c) throws Throwable {
        SingleProcessDataStore$writeData$1 singleProcessDataStore$writeData$1;
        File file;
        FileOutputStream fileOutputStream;
        SingleProcessDataStore<T> singleProcessDataStore;
        FileOutputStream fileOutputStream2;
        FileOutputStream fileOutputStream3;
        if (interfaceC9968c instanceof SingleProcessDataStore$writeData$1) {
            singleProcessDataStore$writeData$1 = (SingleProcessDataStore$writeData$1) interfaceC9968c;
            int i10 = singleProcessDataStore$writeData$1.f5756j;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                singleProcessDataStore$writeData$1.f5756j = i10 - Integer.MIN_VALUE;
            } else {
                singleProcessDataStore$writeData$1 = new SingleProcessDataStore$writeData$1(this, interfaceC9968c);
            }
        } else {
            singleProcessDataStore$writeData$1 = new SingleProcessDataStore$writeData$1(this, interfaceC9968c);
        }
        Object obj = singleProcessDataStore$writeData$1.f5754h;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i11 = singleProcessDataStore$writeData$1.f5756j;
        if (i11 == 0) {
            C7499b.m14977z0(obj);
            File fileM3007d = m3007d();
            File parentFile = fileM3007d.getCanonicalFile().getParentFile();
            if (parentFile != null) {
                parentFile.mkdirs();
                if (!parentFile.isDirectory()) {
                    throw new IOException(C5207g.m11116k(fileM3007d, "Unable to create parent directories of "));
                }
            }
            file = new File(C5207g.m11116k(this.f5670f, m3007d().getAbsolutePath()));
            try {
                fileOutputStream = new FileOutputStream(file);
                try {
                    InterfaceC5691h<T> interfaceC5691h = this.f5666b;
                    C0791b c0791b = new C0791b(fileOutputStream);
                    singleProcessDataStore$writeData$1.f5750d = this;
                    singleProcessDataStore$writeData$1.f5751e = file;
                    singleProcessDataStore$writeData$1.f5752f = fileOutputStream;
                    singleProcessDataStore$writeData$1.f5753g = fileOutputStream;
                    singleProcessDataStore$writeData$1.f5756j = 1;
                    if (interfaceC5691h.mo12055c(t10, c0791b) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    singleProcessDataStore = this;
                    fileOutputStream2 = fileOutputStream;
                    fileOutputStream3 = fileOutputStream2;
                } catch (Throwable th2) {
                    th = th2;
                    throw th;
                }
            } catch (IOException e10) {
                if (file.exists()) {
                    file.delete();
                }
                throw e10;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            fileOutputStream2 = singleProcessDataStore$writeData$1.f5753g;
            fileOutputStream3 = singleProcessDataStore$writeData$1.f5752f;
            file = singleProcessDataStore$writeData$1.f5751e;
            singleProcessDataStore = singleProcessDataStore$writeData$1.f5750d;
            try {
                C7499b.m14977z0(obj);
            } catch (Throwable th3) {
                th = th3;
                fileOutputStream = fileOutputStream3;
                try {
                    throw th;
                } catch (Throwable th4) {
                    C5206f.m11032z0(fileOutputStream, th);
                    throw th4;
                }
            }
        }
        fileOutputStream2.getFD().sync();
        C9072e c9072e = C9072e.f47360a;
        C5206f.m11032z0(fileOutputStream3, null);
        if (file.renameTo(singleProcessDataStore.m3007d())) {
            return C9072e.f47360a;
        }
        throw new IOException("Unable to rename " + file + ".This likely means that there are multiple instances of DataStore for this file. Ensure that you are only creating a single instance of datastore for this file.");
    }
}
