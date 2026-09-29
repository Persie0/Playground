package kotlin.text;

import ae.C0062b;
import cm.InterfaceC2052l;
import dm.C5207g;
import java.util.Iterator;
import java.util.regex.Matcher;
import jm.C6526i;
import kotlin.collections.AbstractCollection;
import kotlin.collections.C6752c;
import kotlin.sequences.C7073a;
import mo.C7655c;
import p249lo.C7423p;
import p385sf.C9000b;

/* JADX INFO: loaded from: classes2.dex */
public final class MatcherMatchResult$groups$1 extends AbstractCollection<C7655c> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ MatcherMatchResult f39970a;

    public MatcherMatchResult$groups$1(MatcherMatchResult matcherMatchResult) {
        this.f39970a = matcherMatchResult;
    }

    @Override // kotlin.collections.AbstractCollection
    /* JADX INFO: renamed from: a */
    public final int mo1847a() {
        return this.f39970a.f39966a.groupCount() + 1;
    }

    @Override // kotlin.collections.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj == null ? true : obj instanceof C7655c) {
            return super.contains((C7655c) obj);
        }
        return false;
    }

    @Override // kotlin.collections.AbstractCollection, java.util.Collection
    public final boolean isEmpty() {
        return false;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator<C7655c> iterator() {
        return new C7423p.a(C7073a.m14261V2(C6752c.m13413G(C9000b.m17248n(this)), new InterfaceC2052l<Integer, C7655c>() { // from class: kotlin.text.MatcherMatchResult$groups$1$iterator$1
            {
                super(1);
            }

            @Override // cm.InterfaceC2052l
            /* JADX INFO: renamed from: n */
            public final C7655c mo528n(Integer num) {
                int iIntValue = num.intValue();
                MatcherMatchResult matcherMatchResult = this.f39971b.f39970a;
                Matcher matcher = matcherMatchResult.f39966a;
                C6526i c6526iM411w2 = C0062b.m411w2(matcher.start(iIntValue), matcher.end(iIntValue));
                if (Integer.valueOf(c6526iM411w2.f37163a).intValue() < 0) {
                    return null;
                }
                String strGroup = matcherMatchResult.f39966a.group(iIntValue);
                C5207g.m11110e(strGroup, "matchResult.group(index)");
                return new C7655c(strGroup, c6526iM411w2);
            }
        }));
    }
}
