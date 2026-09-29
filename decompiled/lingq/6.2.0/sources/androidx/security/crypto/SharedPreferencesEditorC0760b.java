package androidx.security.crypto;

import android.content.SharedPreferences;
import android.util.Pair;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import p000.C3437ov;
import p000.ho2;
import p000.p80;
import p000.ux5;

/* JADX INFO: renamed from: androidx.security.crypto.b */
/* JADX INFO: loaded from: classes.dex */
public final class SharedPreferencesEditorC0760b implements SharedPreferences.Editor {

    /* JADX INFO: renamed from: a */
    public final SharedPreferencesC0761c f7051a;

    /* JADX INFO: renamed from: b */
    public final SharedPreferences.Editor f7052b;

    /* JADX INFO: renamed from: d */
    public final AtomicBoolean f7054d = new AtomicBoolean(false);

    /* JADX INFO: renamed from: c */
    public final CopyOnWriteArrayList f7053c = new CopyOnWriteArrayList();

    public SharedPreferencesEditorC0760b(SharedPreferencesC0761c sharedPreferencesC0761c, SharedPreferences.Editor editor) {
        this.f7051a = sharedPreferencesC0761c;
        this.f7052b = editor;
    }

    /* JADX INFO: renamed from: a */
    public final void m2862a() {
        if (this.f7054d.getAndSet(false)) {
            SharedPreferencesC0761c sharedPreferencesC0761c = this.f7051a;
            for (String str : ((HashMap) sharedPreferencesC0761c.getAll()).keySet()) {
                if (!this.f7053c.contains(str) && !SharedPreferencesC0761c.m2866d(str)) {
                    this.f7052b.remove(sharedPreferencesC0761c.m2867b(str));
                }
            }
        }
    }

    @Override // android.content.SharedPreferences.Editor
    public final void apply() {
        m2862a();
        this.f7052b.apply();
        m2863b();
        this.f7053c.clear();
    }

    /* JADX INFO: renamed from: b */
    public final void m2863b() {
        SharedPreferencesC0761c sharedPreferencesC0761c = this.f7051a;
        for (SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener : sharedPreferencesC0761c.f7056b) {
            Iterator it = this.f7053c.iterator();
            while (it.hasNext()) {
                onSharedPreferenceChangeListener.onSharedPreferenceChanged(sharedPreferencesC0761c, (String) it.next());
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m2864c(String str, byte[] bArr) {
        SharedPreferencesC0761c sharedPreferencesC0761c = this.f7051a;
        sharedPreferencesC0761c.getClass();
        if (SharedPreferencesC0761c.m2866d(str)) {
            throw new SecurityException(ux5.m22990m(str, " is a reserved key for the encryption keyset."));
        }
        this.f7053c.add(str);
        if (str == null) {
            str = "__NULL__";
        }
        try {
            String strM2867b = sharedPreferencesC0761c.m2867b(str);
            try {
                Pair pair = new Pair(strM2867b, new String(p80.m18950b(sharedPreferencesC0761c.f7057c.mo9870a(bArr, strM2867b.getBytes(StandardCharsets.UTF_8))), "US-ASCII"));
                this.f7052b.putString((String) pair.first, (String) pair.second);
            } catch (UnsupportedEncodingException e) {
                throw new AssertionError(e);
            }
        } catch (GeneralSecurityException e2) {
            ho2.m13386g("Could not encrypt data: ", e2.getMessage(), e2);
        }
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor clear() {
        this.f7054d.set(true);
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final boolean commit() {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f7053c;
        m2862a();
        try {
            return this.f7052b.commit();
        } finally {
            m2863b();
            copyOnWriteArrayList.clear();
        }
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putBoolean(String str, boolean z) {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(5);
        byteBufferAllocate.putInt(EncryptedSharedPreferences$EncryptedType.BOOLEAN.getId());
        byteBufferAllocate.put(z ? (byte) 1 : (byte) 0);
        m2864c(str, byteBufferAllocate.array());
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putFloat(String str, float f) {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
        byteBufferAllocate.putInt(EncryptedSharedPreferences$EncryptedType.FLOAT.getId());
        byteBufferAllocate.putFloat(f);
        m2864c(str, byteBufferAllocate.array());
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putInt(String str, int i) {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
        byteBufferAllocate.putInt(EncryptedSharedPreferences$EncryptedType.INT.getId());
        byteBufferAllocate.putInt(i);
        m2864c(str, byteBufferAllocate.array());
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putLong(String str, long j) {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(12);
        byteBufferAllocate.putInt(EncryptedSharedPreferences$EncryptedType.LONG.getId());
        byteBufferAllocate.putLong(j);
        m2864c(str, byteBufferAllocate.array());
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putString(String str, String str2) {
        if (str2 == null) {
            str2 = "__NULL__";
        }
        byte[] bytes = str2.getBytes(StandardCharsets.UTF_8);
        int length = bytes.length;
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(length + 8);
        byteBufferAllocate.putInt(EncryptedSharedPreferences$EncryptedType.STRING.getId());
        byteBufferAllocate.putInt(length);
        byteBufferAllocate.put(bytes);
        m2864c(str, byteBufferAllocate.array());
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putStringSet(String str, Set set) {
        if (set == null) {
            set = new C3437ov(0);
            set.add("__NULL__");
        }
        ArrayList<byte[]> arrayList = new ArrayList(set.size());
        int size = set.size() * 4;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            byte[] bytes = ((String) it.next()).getBytes(StandardCharsets.UTF_8);
            arrayList.add(bytes);
            size += bytes.length;
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(size + 4);
        byteBufferAllocate.putInt(EncryptedSharedPreferences$EncryptedType.STRING_SET.getId());
        for (byte[] bArr : arrayList) {
            byteBufferAllocate.putInt(bArr.length);
            byteBufferAllocate.put(bArr);
        }
        m2864c(str, byteBufferAllocate.array());
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor remove(String str) {
        SharedPreferencesC0761c sharedPreferencesC0761c = this.f7051a;
        sharedPreferencesC0761c.getClass();
        if (SharedPreferencesC0761c.m2866d(str)) {
            throw new SecurityException(ux5.m22990m(str, " is a reserved key for the encryption keyset."));
        }
        this.f7052b.remove(sharedPreferencesC0761c.m2867b(str));
        this.f7053c.add(str);
        return this;
    }
}
