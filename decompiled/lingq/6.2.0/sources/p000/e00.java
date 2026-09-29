package p000;

import com.lingq.core.domain.store.AudioUnderlineMode;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class e00 {
    /* JADX INFO: renamed from: a */
    public static AudioUnderlineMode m10764a(int i) {
        Object next;
        Iterator<E> it = AudioUnderlineMode.getEntries().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((AudioUnderlineMode) next).getValue() != i);
        AudioUnderlineMode audioUnderlineMode = (AudioUnderlineMode) next;
        return audioUnderlineMode == null ? AudioUnderlineMode.Wave : audioUnderlineMode;
    }
}
