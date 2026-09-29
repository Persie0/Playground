package p000;

import android.media.AudioDescriptor;
import android.os.Build;
import android.text.SpannableStringBuilder;
import com.google.common.collect.ImmutableList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

/* JADX INFO: loaded from: classes2.dex */
public abstract class a4d {
    /* JADX INFO: renamed from: a */
    public static void m121a(SpannableStringBuilder spannableStringBuilder, Object obj, int i, int i2) {
        for (Object obj2 : spannableStringBuilder.getSpans(i, i2, obj.getClass())) {
            if (spannableStringBuilder.getSpanStart(obj2) == i && spannableStringBuilder.getSpanEnd(obj2) == i2 && spannableStringBuilder.getSpanFlags(obj2) == 33) {
                spannableStringBuilder.removeSpan(obj2);
            }
        }
        spannableStringBuilder.setSpan(obj, i, i2, 33);
    }

    /* JADX INFO: renamed from: b */
    public static ImmutableList m122b(List list) {
        if (Build.VERSION.SDK_INT < 31 || list == null) {
            return ImmutableList.m6289v();
        }
        TreeSet treeSet = new TreeSet(Comparator.comparing(new C3775xx()).reversed());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AudioDescriptor audioDescriptorM16194d = AbstractC3298lh.m16194d(it.next());
            if (audioDescriptorM16194d.getStandard() == 1) {
                byte[] descriptor = audioDescriptorM16194d.getDescriptor();
                if (descriptor.length != 3) {
                    ss5.m21707d0("AudioDescriptorUtil", "Invalid SAD length: " + descriptor.length);
                } else {
                    byte b = descriptor[0];
                    int i = (b & 7) + 1;
                    if (((b >> 3) & 15) == 1) {
                        treeSet.add(Integer.valueOf(uma.m22818m(i)));
                    }
                }
            }
        }
        return ImmutableList.m6287r(treeSet);
    }
}
