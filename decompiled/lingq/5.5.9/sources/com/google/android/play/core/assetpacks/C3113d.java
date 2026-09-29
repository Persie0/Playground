package com.google.android.play.core.assetpacks;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.SequenceInputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;
import p338qd.C8526b1;
import p338qd.C8590x;
import td.AbstractC9266n;

/* JADX INFO: renamed from: com.google.android.play.core.assetpacks.d */
/* JADX INFO: loaded from: classes.dex */
public final class C3113d extends AbstractC9266n {

    /* JADX INFO: renamed from: a */
    public final TreeMap f15908a = new TreeMap();

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    public C3113d(File file, File file2) throws IOException {
        ArrayList<File> arrayListM9009a = C3125p.m9009a(file, file2);
        if (arrayListM9009a.isEmpty()) {
            throw new zzck(String.format("Virtualized slice archive empty for %s, %s", file, file2));
        }
        long length = 0;
        for (File file3 : arrayListM9009a) {
            this.f15908a.put(Long.valueOf(length), file3);
            length += file3.length();
        }
    }

    @Override // td.AbstractC9266n
    /* JADX INFO: renamed from: a */
    public final long mo8979a() {
        Map.Entry entryLastEntry = this.f15908a.lastEntry();
        return ((File) entryLastEntry.getValue()).length() + ((Long) entryLastEntry.getKey()).longValue();
    }

    @Override // td.AbstractC9266n
    /* JADX INFO: renamed from: b */
    public final InputStream mo8980b(long j10, long j11) throws IOException {
        if (j10 < 0 || j11 < 0) {
            throw new zzck(String.format("Invalid input parameters %s, %s", Long.valueOf(j10), Long.valueOf(j11)));
        }
        long j12 = j10 + j11;
        if (j12 > mo8979a()) {
            throw new zzck(String.format("Trying to access archive out of bounds. Archive ends at: %s. Tried accessing: %s", Long.valueOf(mo8979a()), Long.valueOf(j12)));
        }
        TreeMap treeMap = this.f15908a;
        Long l10 = (Long) treeMap.floorKey(Long.valueOf(j10));
        Long l11 = (Long) treeMap.floorKey(Long.valueOf(j12));
        if (l10.equals(l11)) {
            return new C8590x(m8981l(j10, l10), j11);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(m8981l(j10, l10));
        Collection collectionValues = treeMap.subMap(l10, false, l11, false).values();
        if (!collectionValues.isEmpty()) {
            arrayList.add(new C8526b1(Collections.enumeration(collectionValues)));
        }
        arrayList.add(new C8590x(new FileInputStream((File) treeMap.get(l11)), j11 - (l11.longValue() - j10)));
        return new SequenceInputStream(Collections.enumeration(arrayList));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: l */
    public final FileInputStream m8981l(long j10, Long l10) throws IOException {
        FileInputStream fileInputStream = new FileInputStream((File) this.f15908a.get(l10));
        if (fileInputStream.skip(j10 - l10.longValue()) == j10 - l10.longValue()) {
            return fileInputStream;
        }
        throw new zzck(String.format("Virtualized slice archive corrupt, could not skip in file with key %s", l10));
    }
}
