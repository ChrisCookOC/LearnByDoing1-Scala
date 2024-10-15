import org.scalatest.freespec.AnyFreeSpec
import org.scalatest.matchers.must.Matchers.convertToAnyMustWrapper

class DuplicateFinderTest extends AnyFreeSpec {

  "Duplicate Finder" - {

    "run" - {

      "find duplicates" in {

        DuplicateFinder.run() mustBe ("213vsfd", "abc")


      }


    }

  }
}

