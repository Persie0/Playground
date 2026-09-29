package p338qd;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import androidx.fragment.app.C0987y;
import com.google.android.play.core.assetpacks.C3111b;
import com.google.android.play.core.common.LocalTestingException;
import dm.C5212l;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FilenameFilter;
import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import p289o5.RunnableC7933m;
import p290o6.C7967l0;
import p457wd.C9907h;
import p457wd.C9910k;
import td.InterfaceC9268p;

/* JADX INFO: renamed from: qd.y0 */
/* JADX INFO: loaded from: classes.dex */
public final class C8593y0 implements InterfaceC8589w1 {

    /* JADX INFO: renamed from: f */
    public static final C7967l0 f46045f = new C7967l0("FakeAssetPackService");

    /* JADX INFO: renamed from: a */
    public final String f46046a;

    /* JADX INFO: renamed from: b */
    public final C3111b f46047b;

    /* JADX INFO: renamed from: c */
    public final C8547i1 f46048c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC9268p f46049d;

    /* JADX INFO: renamed from: e */
    public final Handler f46050e = new Handler(Looper.getMainLooper());

    static {
        new AtomicInteger(1);
    }

    public C8593y0(File file, C3111b c3111b, Context context, C8547i1 c8547i1, InterfaceC9268p interfaceC9268p) {
        this.f46046a = file.getAbsolutePath();
        this.f46047b = c3111b;
        this.f46048c = c8547i1;
        this.f46049d = interfaceC9268p;
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    @Override // p338qd.InterfaceC8589w1
    /* JADX INFO: renamed from: a */
    public final C9910k mo8955a(HashMap map) {
        f46045f.m15814o("syncPacks()", new Object[0]);
        ArrayList arrayList = new ArrayList();
        C9910k c9910k = new C9910k();
        synchronized (c9910k.f50543a) {
            if (!(!c9910k.f50545c)) {
                throw new IllegalStateException("Task is already complete");
            }
            c9910k.f50545c = true;
            c9910k.f50546d = arrayList;
        }
        c9910k.f50544b.m12895c(c9910k);
        return c9910k;
    }

    @Override // p338qd.InterfaceC8589w1
    /* JADX INFO: renamed from: b */
    public final void mo8956b(final String str, final int i10) {
        f46045f.m15814o("notifyModuleCompleted", new Object[0]);
        ((Executor) this.f46049d.zza()).execute(new Runnable() { // from class: qd.x0
            @Override // java.lang.Runnable
            public final void run() {
                int i11 = i10;
                String str2 = str;
                C8593y0 c8593y0 = this.f46039a;
                c8593y0.getClass();
                try {
                    c8593y0.m16808h(str2, i11);
                } catch (LocalTestingException e10) {
                    C8593y0.f46045f.m15815p("notifyModuleCompleted failed", e10);
                }
            }
        });
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$ArrayArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX WARN: Unreachable blocks removed: 4, instructions: 4 */
    @Override // p338qd.InterfaceC8589w1
    /* JADX INFO: renamed from: c */
    public final C9910k mo8957c(String str, int i10, int i11, String str2) {
        Object[] objArr = {Integer.valueOf(i10), str, str2, Integer.valueOf(i11)};
        C7967l0 c7967l0 = f46045f;
        c7967l0.m15814o("getChunkFileDescriptor(session=%d, %s, %s, %d)", objArr);
        C9907h c9907h = new C9907h();
        C9910k c9910k = c9907h.f50541a;
        try {
            for (File file : m16809i(str)) {
                if (C0987y.m3837s(file).equals(str2)) {
                    ParcelFileDescriptor parcelFileDescriptorOpen = ParcelFileDescriptor.open(file, 268435456);
                    synchronized (c9910k.f50543a) {
                        if (!(!c9910k.f50545c)) {
                            throw new IllegalStateException("Task is already complete");
                        }
                        c9910k.f50545c = true;
                        c9910k.f50546d = parcelFileDescriptorOpen;
                    }
                    c9910k.f50544b.m12895c(c9910k);
                    return c9910k;
                }
            }
            throw new LocalTestingException(String.format("Local testing slice for '%s' not found.", str2));
        } catch (LocalTestingException e10) {
            c7967l0.m15815p("getChunkFileDescriptor failed", e10);
            C9910k c9910k2 = c9907h.f50541a;
            synchronized (c9910k2.f50543a) {
                if (!(!c9910k2.f50545c)) {
                    throw new IllegalStateException("Task is already complete");
                }
                c9910k2.f50545c = true;
                c9910k2.f50547e = e10;
                c9910k2.f50544b.m12895c(c9910k2);
            }
        } catch (FileNotFoundException e11) {
            c7967l0.m15815p("getChunkFileDescriptor failed", e11);
            LocalTestingException localTestingException = new LocalTestingException("Asset Slice file not found.", e11);
            C9910k c9910k3 = c9907h.f50541a;
            synchronized (c9910k3.f50543a) {
                if (!(!c9910k3.f50545c)) {
                    throw new IllegalStateException("Task is already complete");
                }
                c9910k3.f50545c = true;
                c9910k3.f50547e = localTestingException;
                c9910k3.f50544b.m12895c(c9910k3);
            }
        }
    }

    @Override // p338qd.InterfaceC8589w1
    /* JADX INFO: renamed from: d */
    public final void mo8958d(int i10) {
        f46045f.m15814o("notifySessionFailed", new Object[0]);
    }

    @Override // p338qd.InterfaceC8589w1
    /* JADX INFO: renamed from: e */
    public final void mo8959e(String str, int i10, int i11, String str2) {
        f46045f.m15814o("notifyChunkTransferred", new Object[0]);
    }

    @Override // p338qd.InterfaceC8589w1
    /* JADX INFO: renamed from: f */
    public final void mo8960f(List list) {
        f46045f.m15814o("cancelDownload(%s)", list);
    }

    @Override // p338qd.InterfaceC8589w1
    /* JADX INFO: renamed from: g */
    public final void mo8961g() {
        f46045f.m15814o("keepAlive", new Object[0]);
    }

    /* JADX INFO: renamed from: h */
    public final void m16808h(String str, int i10) throws LocalTestingException {
        Bundle bundle = new Bundle();
        C8547i1 c8547i1 = this.f46048c;
        bundle.putInt("app_version_code", c8547i1.m16652a());
        bundle.putInt("session_id", i10);
        File[] fileArrM16809i = m16809i(str);
        ArrayList<String> arrayList = new ArrayList<>();
        long length = 0;
        for (File file : fileArrM16809i) {
            length += file.length();
            ArrayList<? extends Parcelable> arrayList2 = new ArrayList<>();
            arrayList2.add(null);
            String strM3837s = C0987y.m3837s(file);
            bundle.putParcelableArrayList(C5212l.m11181u0("chunk_intents", str, strM3837s), arrayList2);
            try {
                bundle.putString(C5212l.m11181u0("uncompressed_hash_sha256", str, strM3837s), C8523a1.m16631a(Arrays.asList(file)));
                bundle.putLong(C5212l.m11181u0("uncompressed_size", str, strM3837s), file.length());
                arrayList.add(strM3837s);
            } catch (IOException e10) {
                throw new LocalTestingException(String.format("Could not digest file: %s.", file), e10);
            } catch (NoSuchAlgorithmException e11) {
                throw new LocalTestingException("SHA256 algorithm not supported.", e11);
            }
        }
        bundle.putStringArrayList(C5212l.m11179t0("slice_ids", str), arrayList);
        bundle.putLong(C5212l.m11179t0("pack_version", str), c8547i1.m16652a());
        bundle.putInt(C5212l.m11179t0("status", str), 4);
        bundle.putInt(C5212l.m11179t0("error_code", str), 0);
        bundle.putLong(C5212l.m11179t0("bytes_downloaded", str), length);
        bundle.putLong(C5212l.m11179t0("total_bytes_to_download", str), length);
        bundle.putStringArrayList("pack_names", new ArrayList<>(Arrays.asList(str)));
        bundle.putLong("bytes_downloaded", length);
        bundle.putLong("total_bytes_to_download", length);
        this.f46050e.post(new RunnableC7933m(this, 12, new Intent("com.google.android.play.core.assetpacks.receiver.ACTION_SESSION_UPDATE").putExtra("com.google.android.play.core.assetpacks.receiver.EXTRA_SESSION_STATE", bundle)));
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    /* JADX INFO: renamed from: i */
    public final File[] m16809i(final String str) throws LocalTestingException {
        File file = new File(this.f46046a);
        if (!file.isDirectory()) {
            throw new LocalTestingException(String.format("Local testing directory '%s' not found.", file));
        }
        File[] fileArrListFiles = file.listFiles(new FilenameFilter() { // from class: qd.w0
            @Override // java.io.FilenameFilter
            public final boolean accept(File file2, String str2) {
                return str2.startsWith(String.valueOf(str).concat("-")) && str2.endsWith(".apk");
            }
        });
        if (fileArrListFiles == null) {
            throw new LocalTestingException(String.format("Failed fetching APKs for pack '%s'.", str));
        }
        if (fileArrListFiles.length == 0) {
            throw new LocalTestingException(String.format("No APKs available for pack '%s'.", str));
        }
        for (File file2 : fileArrListFiles) {
            if (C0987y.m3837s(file2).equals(str)) {
                return fileArrListFiles;
            }
        }
        throw new LocalTestingException(String.format("No main slice available for pack '%s'.", str));
    }
}
